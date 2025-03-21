package problem21

import (
	"container/heap"
	"sort"
)

func Solution(intervals [][]int) int {
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

	h := &IntHeap{}
	heap.Init(h)
	count := 0

	for _, interval := range intervals {
		if h.Len() == 0 {
			count++
			heap.Push(h, interval[1])
		} else {
			if interval[0] >= (*h)[0] {
				heap.Pop(h)
			} else {
				count++
			}
			heap.Push(h, interval[1])
		}
	}
	return count
}

type IntHeap []int

func (h IntHeap) Len() int           { return len(h) }
func (h IntHeap) Less(i, j int) bool { return h[i] < h[j] }
func (h IntHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *IntHeap) Push(x any) {
	*h = append(*h, x.(int))
}

func (h *IntHeap) Pop() any {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[0 : n-1]
	return x
}

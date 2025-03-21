package problem12

func Solution(n int, steps []int) int {
	ways := make([]int, n+1)
	ways[0] = 1

	for i := 1; i <= n; i++ {
		for _, step := range steps {
			if i >= step {
				ways[i] += ways[i-step]
			}
		}
	}

	return ways[n]
}

package problem01

func Solution(numbers []int, k int) []int {
	seen := make(map[int]bool)
	for _, num := range numbers {
		if seen[k-num] {
			return []int{k - num, num}
		}
		seen[num] = true
	}
	return nil
}

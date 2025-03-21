package problem09

func Solution(array []int) int {
	if len(array) == 0 {
		return 0
	}

	swap := 0
	max := array[0]

	for i := 1; i < len(array); i++ {
		current := max
		if swap > max {
			current = swap
		}
		max = swap + array[i]
		swap = current
	}

	if max > swap {
		return max
	}
	return swap
}

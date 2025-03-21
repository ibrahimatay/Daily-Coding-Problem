package problem02

func Solution(numbers []int) []int {
	length := len(numbers)
	result := make([]int, length)

	for i := range numbers {
		product := 1
		for j, value := range numbers {
			if i != j {
				product *= value
			}
		}
		result[i] = product
	}
	return result
}

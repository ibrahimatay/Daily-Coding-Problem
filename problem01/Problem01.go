package problem01

/*
   This problem was recently asked by Google.

   Given a list of numbers and a number k, return whether any two numbers
   from the list add up to k.

   For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

func Solution(numbers []int, k int) []int {
	for i := 0; i < len(numbers); i++ {
		for j := 0; j < len(numbers); j++ {
			if i == j {
				continue
			}

			if numbers[i]+numbers[j] == k {
				result := []int{numbers[i], numbers[j]}
				return result
			}
		}
	}

	return nil
}

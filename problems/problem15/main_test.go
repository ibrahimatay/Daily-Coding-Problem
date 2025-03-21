package problem15

import (
	"testing"
)

func TestSolution(t *testing.T) {
	p := &Model{}
	numbers := []int{1, 2, 3, 4, 5, 6, 7}
	for i := range numbers {
		_ = p.Solution(numbers[i])
	}
}

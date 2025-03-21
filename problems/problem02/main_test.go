package problem02

import (
	"reflect"
	"testing"
)

func TestSolution(t *testing.T) {
	tests := []struct {
		input    []int
		expected []int
	}{
		{[]int{1, 2, 3, 4, 5}, []int{120, 60, 40, 30, 24}},
		{[]int{3, 2, 1}, []int{2, 3, 6}},
		{[]int{1, 7, 3, 3, 4, 4}, []int{1008, 144, 336, 336, 252, 252}},
	}

	for _, test := range tests {
		result := Solution(test.input)
		if !reflect.DeepEqual(result, test.expected) {
			t.Errorf("Expected %v, got %v", test.expected, result)
		}
	}
}

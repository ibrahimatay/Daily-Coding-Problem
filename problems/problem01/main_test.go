package problem01

import (
	"reflect"
	"testing"
)

func TestSolution(t *testing.T) {
	numbers := []int{10, 15, 3, 7}

	tests := []struct {
		k        int
		expected []int
	}{
		{17, []int{10, 7}},
		{10, []int{3, 7}},
		{18, []int{15, 3}},
	}

	for _, test := range tests {
		result := Solution(numbers, test.k)
		if !reflect.DeepEqual(result, test.expected) {
			t.Errorf("Expected %v, got %v", test.expected, result)
		}
	}
}

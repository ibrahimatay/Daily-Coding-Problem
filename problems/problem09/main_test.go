package problem09

import "testing"

func TestSolution09(t *testing.T) {
	cases := []struct {
		input    []int
		expected int
	}{
		{[]int{}, 0},
		{[]int{2, 4, 6, 2, 5}, 13},
		{[]int{1, 20, 3}, 20},
		{[]int{5, 5, 10, 100, 10, 5}, 110},
	}

	for _, c := range cases {
		result := Solution(c.input)
		if result != c.expected {
			t.Errorf("Solution09(%v) == %d, expected %d", c.input, result, c.expected)
		}
	}
}

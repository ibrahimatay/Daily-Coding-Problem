package problem21

import "testing"

func TestSolution(t *testing.T) {
	tests := []struct {
		input    [][]int
		expected int
	}{
		{[][]int{{30, 75}, {0, 50}, {60, 150}}, 2},
		{[][]int{{5, 7}, {0, 9}, {5, 9}}, 3},
		{[][]int{{0, 50}, {30, 75}, {60, 150}}, 2},
		{[][]int{{0, 120}, {30, 75}, {75, 80}}, 2},
	}

	for _, test := range tests {
		got := Solution(test.input)
		if got != test.expected {
			t.Errorf("Problem21(%v) = %d; expected %d", test.input, got, test.expected)
		}
	}
}

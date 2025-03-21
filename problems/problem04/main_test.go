package problem04

import "testing"

func TestSolution(t *testing.T) {
	tests := []struct {
		input []int
		want  int
	}{
		{[]int{3, 4, -1, 1}, 2},
		{[]int{1, 2, 0}, 3},
		{[]int{7, 8, 9, 11, 12}, 1},
	}

	for _, tt := range tests {
		got := Solution(tt.input)
		if got != tt.want {
			t.Errorf("Expected %d, got %d", tt.want, got)
		}
	}
}

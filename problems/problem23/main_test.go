package problem23

import "testing"

func TestSolution(t *testing.T) {
	board := [][]bool{
		{false, false, false, false},
		{true, true, false, true},
		{false, false, false, false},
		{false, false, false, false},
	}
	start := []int{3, 0}
	end := []int{0, 0}
	expected := 7

	got := Solution(board, start, end)
	if got != expected {
		t.Errorf("Problem23(board, %v, %v) = %d; expected %d", start, end, got, expected)
	}
}

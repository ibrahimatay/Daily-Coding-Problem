package problem12

import "testing"

func TestSolution(t *testing.T) {
	if Solution(4, []int{1, 3, 5}) != 3 {
		t.Error("Expected 3 ways for n=4, steps={1,3,5}")
	}

	if Solution(4, []int{1, 2, 3}) != 7 {
		t.Error("Expected 7 ways for n=4, steps={1,2,3}")
	}

	if Solution(3, []int{1, 2, 3}) != 4 {
		t.Error("Expected 4 ways for n=3, steps={1,2,3}")
	}
}

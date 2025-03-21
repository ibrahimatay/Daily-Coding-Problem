package problem14

import "testing"

func TestSolution(t *testing.T) {
	result := Solution(1)
	if result <= 3.0 {
		t.Errorf("Expected result > 3.0, got %f", result)
	}
}

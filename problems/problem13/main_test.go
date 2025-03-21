package problem13

import "testing"

func TestSolution(t *testing.T) {
	result := Solution("abcba", 2)
	if result != 3 {
		t.Errorf("Expected 3, got %d", result)
	}
}

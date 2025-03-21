package problem08

import "testing"

func TestSolution(t *testing.T) {
	root := &Node{Value: 0,
		Left: &Node{Value: 1},
		Right: &Node{Value: 0,
			Left: &Node{Value: 1,
				Left:  &Node{Value: 1},
				Right: &Node{Value: 1}},
			Right: &Node{Value: 0}}}

	if CountUnivalSubtrees(root) != 5 {
		t.Errorf("Expected 5 unival subtrees")
	}

	if CountUnivalSubtrees(nil) != 0 {
		t.Errorf("Expected 0 unival subtrees for nil root")
	}
}

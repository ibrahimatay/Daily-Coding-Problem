package problem24

import "testing"

func TestBinaryTreeNode(t *testing.T) {
	root := NewBinaryTreeNode(nil)
	left := NewBinaryTreeNode(root)
	right := NewBinaryTreeNode(root)
	root.left = left
	root.right = right

	if !left.Lock() {
		t.Error("Expected left to be locked successfully")
	}

	if root.Lock() {
		t.Error("Expected root lock to fail due to locked descendant")
	}

	if !left.Unlock() {
		t.Error("Expected left to be unlocked successfully")
	}

	if !root.Lock() {
		t.Error("Expected root to be locked successfully after unlocking left")
	}

	if right.Lock() {
		t.Error("Expected right lock to fail due to locked ancestor (root)")
	}
}

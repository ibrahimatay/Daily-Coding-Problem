package problem24

type BinaryTreeNode struct {
	left, right, parent *BinaryTreeNode
	isLocked            bool
	lockedDescendants   int
}

func NewBinaryTreeNode(parent *BinaryTreeNode) *BinaryTreeNode {
	return &BinaryTreeNode{parent: parent}
}

func (n *BinaryTreeNode) IsLocked() bool {
	return n.isLocked
}

func (n *BinaryTreeNode) Lock() bool {
	if n.isLocked || n.lockedDescendants > 0 || n.hasLockedAncestors() {
		return false
	}

	n.isLocked = true
	for p := n.parent; p != nil; p = p.parent {
		p.lockedDescendants++
	}

	return true
}

func (n *BinaryTreeNode) Unlock() bool {
	if !n.isLocked {
		return false
	}

	n.isLocked = false
	for p := n.parent; p != nil; p = p.parent {
		p.lockedDescendants--
	}

	return true
}

func (n *BinaryTreeNode) hasLockedAncestors() bool {
	for p := n.parent; p != nil; p = p.parent {
		if p.isLocked {
			return true
		}
	}
	return false
}

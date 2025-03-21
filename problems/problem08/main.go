package problem08

type Node struct {
	Value int
	Left  *Node
	Right *Node
}

func CountUnivalSubtrees(root *Node) int {
	count, _ := countUnivalHelper(root)
	return count
}

func countUnivalHelper(node *Node) (int, bool) {
	if node == nil {
		return 0, true
	}

	leftCount, isLeftUnival := countUnivalHelper(node.Left)
	rightCount, isRightUnival := countUnivalHelper(node.Right)

	total := leftCount + rightCount

	if isLeftUnival && isRightUnival {
		if node.Left != nil && node.Left.Value != node.Value {
			return total, false
		}
		if node.Right != nil && node.Right.Value != node.Value {
			return total, false
		}
		return total + 1, true
	}
	return total, false
}

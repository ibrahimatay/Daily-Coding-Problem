package problem03

import (
	"strings"
)

type Node struct {
	Value string
	Left  *Node
	Right *Node
}

func Serialize(node *Node) string {
	if node == nil {
		return "#"
	}

	queue := []*Node{node}
	var builder strings.Builder

	for len(queue) > 0 {
		current := queue[0]
		queue = queue[1:]

		if current != nil {
			builder.WriteString(current.Value + ",")
			queue = append(queue, current.Left, current.Right)
		} else {
			builder.WriteString("#,")
		}
	}

	return strings.TrimRight(builder.String(), ",")
}

func Deserialize(data string) *Node {
	if data == "#" {
		return nil
	}

	parts := strings.Split(data, ",")
	root := &Node{Value: parts[0]}
	queue := []*Node{root}
	i := 1

	for len(queue) > 0 {
		current := queue[0]
		queue = queue[1:]

		if parts[i] != "#" {
			current.Left = &Node{Value: parts[i]}
			queue = append(queue, current.Left)
		}
		i++

		if parts[i] != "#" {
			current.Right = &Node{Value: parts[i]}
			queue = append(queue, current.Right)
		}
		i++
	}

	return root
}

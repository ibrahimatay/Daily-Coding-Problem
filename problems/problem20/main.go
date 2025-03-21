package main

import (
    "fmt"
)

type Node struct {
    Value int
    Next  *Node
}

func findIntersection(n1, n2 *Node) *Node {
    if n1 == nil || n2 == nil {
        return nil
    }

    a, b := n1, n2
    for a != b {
        if a != nil {
            a = a.Next
        } else {
            a = n2
        }

        if b != nil {
            b = b.Next
        } else {
            b = n1
        }
    }
    return a
}

func main() {
    common := &Node{8, &Node{10, nil}}
    l1 := &Node{1, &Node{2, &Node{3, &Node{7, common}}}}
    l2 := &Node{99, &Node{1, common}}

    intersect := findIntersection(l1, l2)
    if intersect != nil {
        fmt.Println(intersect.Value) // 8
    } else {
        fmt.Println("No intersection")
    }
}
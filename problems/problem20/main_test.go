package main

import "testing"

func TestFindIntersection(t *testing.T) {
    common := &Node{8, &Node{10, nil}}
    l1 := &Node{1, &Node{2, &Node{3, &Node{7, common}}}}
    l2 := &Node{99, &Node{1, common}}

    result := findIntersection(l1, l2)
    if result == nil || result.Value != 8 {
        t.Errorf("Expected intersecting node with value 8, got %v", result)
    }
}
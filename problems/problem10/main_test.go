package problem10

import (
	"fmt"
	"testing"
)

func TestSolution(t *testing.T) {
	called := false
	Solution(func() {
		fmt.Println("Hello")
		called = true
	}, 100)

	if !called {
		t.Error("Expected function to be called")
	}
}

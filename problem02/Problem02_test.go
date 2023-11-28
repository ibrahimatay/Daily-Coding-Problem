package problem02

import (
	"Daily-Coding-Problem/utils"
	"testing"
)

func TestSolutionInput1(t *testing.T) {
	numbers := []int{1, 2, 3, 4, 5}
	expected := []int{120, 60, 40, 30, 24}

	result := Solution(numbers)

	if !utils.IntArrayEquals(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}

func TestSolutionInput2(t *testing.T) {
	numbers := []int{3, 2, 1}
	expected := []int{2, 3, 6}

	result := Solution(numbers)

	if !utils.IntArrayEquals(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}

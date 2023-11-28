package problem01

import (
	"Daily-Coding-Problem/utils"
	"testing"
)

func TestSolutionFor17(t *testing.T) {
	numbers := []int{10, 15, 3, 7}
	k := 17
	expected := []int{10, 7}

	result := Solution(numbers, k)

	if !utils.IntArraysEqual(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}

func TestSolutionFor10(t *testing.T) {
	numbers := []int{10, 15, 3, 7}
	k := 10
	expected := []int{3, 7}

	result := Solution(numbers, k)

	if !utils.IntArraysEqual(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}

func TestSolutionFor18(t *testing.T) {
	numbers := []int{10, 15, 3, 7}
	k := 18
	expected := []int{15, 3}

	result := Solution(numbers, k)

	if !utils.IntArraysEqual(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}

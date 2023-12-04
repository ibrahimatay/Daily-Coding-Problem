package problem02

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestSolutionInput1(t *testing.T) {
	numbers := []int{1, 2, 3, 4, 5}
	expected := []int{120, 60, 40, 30, 24}

	result := Solution(numbers)

	assert.Equal(t, result, expected)
}

func TestSolutionInput2(t *testing.T) {
	numbers := []int{3, 2, 1}
	expected := []int{2, 3, 6}

	result := Solution(numbers)

	assert.Equal(t, result, expected)
}

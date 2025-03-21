package problem22

import "testing"

func TestSolution(t *testing.T) {
	tests := []struct {
		s        string
		wordDict []string
		expected bool
	}{
		{"leetcode", []string{"leet", "code"}, true},
		{"applepenapple", []string{"apple", "pen"}, true},
		{"catsandog", []string{"cats", "dog", "sand", "and", "cat"}, false},
	}

	for _, test := range tests {
		got := Solution(test.s, test.wordDict)
		if got != test.expected {
			t.Errorf("Problem22(%q, %v) = %v; expected %v", test.s, test.wordDict, got, test.expected)
		}
	}
}

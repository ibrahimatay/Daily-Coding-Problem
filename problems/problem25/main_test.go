package problem25

import "testing"

func TestSolution(t *testing.T) {
	tests := []struct {
		text     string
		pattern  string
		expected bool
	}{
		{"ray", "ra.", true},
		{"raymond", "ra.", false},
		{"chat", ".*at", true},
		{"chats", ".*at", false},
		{"mississippi", "mis*is*p*.", false},
		{"aab", "c*a*b", true},
		{"", "c*", true},
		{"abc", ".*", true},
		{"aaa", "a*a", true},
		{"abcd", "d*", false},
	}

	for _, test := range tests {
		got := Solution(test.text, test.pattern)
		if got != test.expected {
			t.Errorf("Solution(%q, %q) = %v; expected %v", test.text, test.pattern, got, test.expected)
		}
	}
}

package problem11

import (
	"testing"
)

func TestSolution(t *testing.T) {
	trie := NewTrie()
	words := []string{"dog", "deer", "deal"}
	for _, word := range words {
		trie.Add(word)
	}

	result := trie.GetWordsWithPrefix("de")
	if len(result) != 2 {
		t.Errorf("Expected 2 results for prefix 'de', got %d", len(result))
	}

	result = trie.GetWordsWithPrefix("d")
	if len(result) != 3 {
		t.Errorf("Expected 3 results for prefix 'd', got %d", len(result))
	}
}

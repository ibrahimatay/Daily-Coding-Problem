package problem11

type TrieNode struct {
	children map[rune]*TrieNode
	isLeaf   bool
}

type Trie struct {
	root *TrieNode
}

func NewTrie() *Trie {
	return &Trie{root: &TrieNode{children: make(map[rune]*TrieNode)}}
}

func (t *Trie) Add(word string) {
	node := t.root
	for _, ch := range word {
		if _, ok := node.children[ch]; !ok {
			node.children[ch] = &TrieNode{children: make(map[rune]*TrieNode)}
		}
		node = node.children[ch]
	}
	node.isLeaf = true
}

func (t *Trie) searchPrefix(prefix string) *TrieNode {
	node := t.root
	for _, ch := range prefix {
		if next, ok := node.children[ch]; ok {
			node = next
		} else {
			return nil
		}
	}
	return node
}

func (t *Trie) collectWords(node *TrieNode, prefix string, result *[]string) {
	if node.isLeaf {
		*result = append(*result, prefix)
	}
	for ch, child := range node.children {
		t.collectWords(child, prefix+string(ch), result)
	}
}

func (t *Trie) GetWordsWithPrefix(prefix string) []string {
	result := []string{}
	node := t.searchPrefix(prefix)
	if node != nil {
		t.collectWords(node, prefix, &result)
	}
	return result
}

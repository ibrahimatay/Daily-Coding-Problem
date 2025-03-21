package problem25

func Solution(text, pattern string) bool {
	return matchHelper(text, pattern, 0, 0)
}

func matchHelper(text, pattern string, i, j int) bool {
	if j == len(pattern) {
		return i == len(text)
	}

	firstMatch := i < len(text) && (pattern[j] == text[i] || pattern[j] == '.')

	if j+1 < len(pattern) && pattern[j+1] == '*' {
		return matchHelper(text, pattern, i, j+2) || (firstMatch && matchHelper(text, pattern, i+1, j))
	} else {
		return firstMatch && matchHelper(text, pattern, i+1, j+1)
	}
}

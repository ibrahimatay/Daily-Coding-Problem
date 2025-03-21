package problem13

func Solution(s string, k int) int {
	if len(s) == 0 || k == 0 {
		return 0
	}

	max := 0
	builder := ""
	characterSet := make(map[rune]bool)

	for _, char := range s {
		if len(characterSet) == k && !characterSet[char] {
			firstChar := rune(builder[0])
			idx := 1
			for i, c := range builder {
				if c == firstChar {
					idx = i + 1
					break
				}
			}
			builder = builder[idx:]
			characterSet = make(map[rune]bool)
			for _, c := range builder {
				characterSet[c] = true
			}
		}

		characterSet[char] = true
		builder += string(char)

		if len(builder) > max {
			max = len(builder)
		}
	}

	return max
}

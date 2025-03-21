package problem07

import "testing"

func TestSolution07(t *testing.T) {
	cases := map[string]int{
		"111":  3,
		"1234": 3,
		"121":  3,
		"12":   2,
		"001":  0,
	}
	for input, expected := range cases {
		if res := Solution(input); res != expected {
			t.Errorf("NumDecodings(%s) = %d; want %d", input, res, expected)
		}
	}
}

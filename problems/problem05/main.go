package problem05

type Pair struct {
	a, b int
}

func Cons(a, b int) Pair {
	return Pair{a: a, b: b}
}

func Car(p Pair) int {
	return p.a
}

func Cdr(p Pair) int {
	return p.b
}

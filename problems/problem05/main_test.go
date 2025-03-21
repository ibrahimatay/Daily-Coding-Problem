package problem05

import "testing"

func TestSolution(t *testing.T) {
	if Car(Cons(3, 4)) != 3 {
		t.Errorf("Expected Car(Cons(3, 4)) to be 3")
	}
	if Cdr(Cons(3, 4)) != 4 {
		t.Errorf("Expected Cdr(Cons(3, 4)) to be 4")
	}
	if Car(Cons(2, 9)) != 2 {
		t.Errorf("Expected Car(Cons(2, 9)) to be 2")
	}
	if Cdr(Cons(1, 6)) != 6 {
		t.Errorf("Expected Cdr(Cons(1, 6)) to be 6")
	}
}

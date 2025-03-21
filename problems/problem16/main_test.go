package problem16

import "testing"

func TestSolution(t *testing.T) {
	p, err := NewPModel(6)
	if err != nil {
		t.Fatal(err)
	}
	for i := 1; i <= 6; i++ {
		p.Record(i)
	}

	for i := 1; i <= 6; i++ {
		val, err := p.GetLast(i)
		if err != nil {
			t.Fatal(err)
		}
		expected := 7 - i
		if val != expected {
			t.Errorf("Expected %d, got %d", expected, val)
		}
	}
}

func TestSolutionZeroSize(t *testing.T) {
	_, err := NewPModel(0)
	if err == nil {
		t.Error("Expected error for zero size")
	}
}

func TestSolutionOutOfRange(t *testing.T) {
	p, _ := NewPModel(2)
	p.Record(1)
	p.Record(2)
	_, err := p.GetLast(3)
	if err == nil {
		t.Error("Expected error for i > maxSize")
	}
}

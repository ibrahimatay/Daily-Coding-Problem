package problem06

import (
	"testing"
)

func TestAddAndGetSingleElement(t *testing.T) {
	list := NewXORLinkedList()
	list.Add(10)

	val, err := list.Get(0)
	if err != nil || val != 10 {
		t.Errorf("Expected 10 at index 0, got %d (err: %v)", val, err)
	}
}

func TestAddMultipleElements(t *testing.T) {
	list := NewXORLinkedList()
	list.Add(10)
	list.Add(20)
	list.Add(30)
	list.Add(40)

	expected := []int{10, 20, 30, 40}
	for i, v := range expected {
		val, err := list.Get(i)
		if err != nil || val != v {
			t.Errorf("Expected %d at index %d, got %d (err: %v)", v, i, val, err)
		}
	}
}

func TestGetWithInvalidIndex(t *testing.T) {
	list := NewXORLinkedList()
	list.Add(10)
	list.Add(20)

	_, err := list.Get(3)
	if err == nil {
		t.Error("Expected error for invalid index, got none")
	}
}

func TestAddAndRetrieveSequentially(t *testing.T) {
	list := NewXORLinkedList()
	for i := 0; i < 1000; i++ {
		list.Add(i)
	}

	for i := 0; i < 1000; i++ {
		val, err := list.Get(i)
		if err != nil || val != i {
			t.Errorf("Expected %d at index %d, got %d (err: %v)", i, i, val, err)
		}
	}
}

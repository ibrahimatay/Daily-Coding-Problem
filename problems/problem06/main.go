package problem06

type Node struct {
	Data int
	Both uintptr
}

type XORLinkedList struct {
	memory    map[uintptr]*Node
	Head      uintptr
	Tail      uintptr
	idCounter uintptr
}

func NewXORLinkedList() *XORLinkedList {
	return &XORLinkedList{
		memory:    make(map[uintptr]*Node),
		Head:      0,
		Tail:      0,
		idCounter: 1,
	}
}

func (x *XORLinkedList) getPointer(node *Node) uintptr {
	if node == nil {
		return 0
	}
	address := x.idCounter
	x.memory[address] = node
	x.idCounter++
	return address
}

func (x *XORLinkedList) dereferencePointer(address uintptr) *Node {
	return x.memory[address]
}

func (x *XORLinkedList) Add(element int) {
	newNode := &Node{Data: element, Both: 0}
	newPtr := x.getPointer(newNode)

	if x.Head == 0 {
		x.Head = newPtr
		x.Tail = newPtr
	} else {
		tailNode := x.dereferencePointer(x.Tail)
		newNode.Both = x.Tail
		tailNode.Both ^= newPtr
		x.Tail = newPtr
	}
}

func (x *XORLinkedList) Get(index int) (int, error) {
	current := x.Head
	prev := uintptr(0)
	var next uintptr

	for i := 0; i < index; i++ {
		currentNode := x.dereferencePointer(current)
		next = prev ^ currentNode.Both
		if next == 0 {
			return 0, &IndexOutOfBoundsError{Index: index}
		}
		prev = current
		current = next
	}

	return x.dereferencePointer(current).Data, nil
}

type IndexOutOfBoundsError struct {
	Index int
}

func (e *IndexOutOfBoundsError) Error() string {
	return "Index out of bounds"
}

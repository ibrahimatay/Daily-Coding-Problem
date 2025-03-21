package problem16

import (
	"errors"
)

type Model struct {
	maxSize int
	buffer  []int
	index   int
}

func NewPModel(maxSize int) (*Model, error) {
	if maxSize == 0 {
		return nil, errors.New("maxSize cannot be zero")
	}

	return &Model{
		maxSize: maxSize,
		buffer:  make([]int, maxSize),
		index:   0,
	}, nil
}

func (p *Model) Record(orderId int) {
	p.buffer[p.index] = orderId
	p.index = (p.index + 1) % p.maxSize
}

func (p *Model) GetLast(i int) (int, error) {
	if i > p.maxSize {
		return 0, errors.New("value cannot be greater than maxSize")
	}
	return p.buffer[(p.index-i+p.maxSize)%p.maxSize], nil
}

package problem15

import (
	"math/rand"
)

type Model struct {
	count         int
	currentNumber int
}

func (p *Model) Solution(x int) int {
	p.count++
	if p.count == 1 {
		p.currentNumber = x
	} else {
		index := rand.Intn(p.count)
		if index == p.count-1 {
			p.currentNumber = x
		}
	}
	return p.currentNumber
}

package problem10

import (
	"time"
)

func Solution(f func(), n int) {
	if n < 0 {
		panic("Delay must be non-negative")
	}
	time.Sleep(time.Duration(n) * time.Millisecond)
	f()
}

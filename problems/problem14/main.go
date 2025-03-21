package problem14

import (
	"math"
	"math/rand"
)

func Solution(r int) float64 {
	inside := 1.0
	outside := 1.0

	for i := 0; i < 10000; i++ {
		x := rand.Float64()*2 - 1
		y := rand.Float64()*2 - 1

		distance := math.Sqrt(x*x + y*y)
		if distance > 1 {
			outside++
		} else {
			inside++
		}
	}

	total := inside + outside
	return 4 * (inside / total)
}

package main

import "testing"

func TestMaxSubarray(t *testing.T) {
    tests := []struct {
        input []int
        k     int
        want  int
    }{
        {[]int{10, 5, 2}, 3, 10},
        {[]int{5, 2, 7}, 3, 7},
        {[]int{2, 7, 8}, 3, 8},
        {[]int{7, 8, 7}, 3, 8},
    }

    for _, tt := range tests {
        got := maxSubarray(tt.input, tt.k)
        if got != tt.want {
            t.Errorf("maxSubarray(%v, %d) = %d; want %d", tt.input, tt.k, got, tt.want)
        }
    }
}
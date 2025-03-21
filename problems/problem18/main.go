package main

import (
    "fmt"
)

func maxSubarray(array []int, k int) int {
    max := array[0]
    for i := 1; i < k; i++ {
        if array[i] > max {
            max = array[i]
        }
    }
    return max
}

func main() {
    fmt.Println(maxSubarray([]int{10, 5, 2}, 3)) // 10
    fmt.Println(maxSubarray([]int{5, 2, 7}, 3))  // 7
    fmt.Println(maxSubarray([]int{2, 7, 8}, 3))  // 8
    fmt.Println(maxSubarray([]int{7, 8, 7}, 3))  // 8
}
package main

import (
    "fmt"
)

func housePainting(n int, k int) int {
    const mod = 1000000007
    dp := make([]int, n+1)
    dp[1] = k
    same := 0
    diff := k

    for i := 2; i <= n; i++ {
        same = diff
        diff = (dp[i-1] * (k - 1)) % mod
        dp[i] = (same + diff) % mod
    }

    return dp[n]
}

func main() {
    fmt.Println(housePainting(2, 4)) // 16
    fmt.Println(housePainting(3, 2)) // 6
}
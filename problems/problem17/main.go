package main

import (
    "fmt"
    "strings"
)

func lengthLongestPathByArray(input string) int {
    files := strings.Split(input, "\n")
    stack := make([]int, len(files)+1)
    maxLength := 0

    for _, s := range files {
        level := strings.LastIndex(s, "\t") + 1
        curLength := stack[level] + len(s) - level + 1
        stack[level+1] = curLength
        if strings.Contains(s, ".") {
            if curLength-1 > maxLength {
                maxLength = curLength - 1
            }
        }
    }

    return maxLength
}

func lengthLongestPathByStack(input string) int {
    stack := []int{0}
    maxLen := 0

    for _, s := range strings.Split(input, "\n") {
        lev := strings.LastIndex(s, "\t") + 1
        for len(stack) > lev+1 {
            stack = stack[:len(stack)-1]
        }
        length := stack[len(stack)-1] + len(s) - lev + 1
        stack = append(stack, length)
        if strings.Contains(s, ".") {
            if length-1 > maxLen {
                maxLen = length - 1
            }
        }
    }

    return maxLen
}

func main() {
    input := "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
    fmt.Println(lengthLongestPathByArray(input)) // 32
    fmt.Println(lengthLongestPathByStack(input)) // 32
}
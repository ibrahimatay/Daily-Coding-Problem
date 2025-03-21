package main

import "testing"

func TestLengthLongestPathByArray(t *testing.T) {
    input := "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
    expected := 32
    if result := lengthLongestPathByArray(input); result != expected {
        t.Errorf("lengthLongestPathByArray() = %d; want %d", result, expected)
    }
}

func TestLengthLongestPathByStack(t *testing.T) {
    input := "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
    expected := 32
    if result := lengthLongestPathByStack(input); result != expected {
        t.Errorf("lengthLongestPathByStack() = %d; want %d", result, expected)
    }
}
package main

import "testing"

func TestHousePainting(t *testing.T) {
    if got := housePainting(2, 4); got != 16 {
        t.Errorf("housePainting(2, 4) = %d; want 16", got)
    }
    if got := housePainting(3, 2); got != 6 {
        t.Errorf("housePainting(3, 2) = %d; want 6", got)
    }
}
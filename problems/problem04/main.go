package problem04

func Solution(arr []int) int {
	n := len(arr)
	for i := 0; i < n; i++ {
		for arr[i] > 0 && arr[i] <= n && arr[arr[i]-1] != arr[i] {
			arr[arr[i]-1], arr[i] = arr[i], arr[arr[i]-1]
		}
	}

	for i := 0; i < n; i++ {
		if arr[i] != i+1 {
			return i + 1
		}
	}
	return n + 1
}

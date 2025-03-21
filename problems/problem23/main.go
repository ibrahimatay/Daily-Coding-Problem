package problem23

type Point struct {
	Row, Col, Steps int
}

func Solution(board [][]bool, start, end []int) int {
	rows := len(board)
	cols := len(board[0])
	visited := make([][]bool, rows)
	for i := range visited {
		visited[i] = make([]bool, cols)
	}

	queue := []Point{{start[0], start[1], 0}}
	directions := [][]int{{-1, 0}, {0, -1}, {1, 0}, {0, 1}}

	for len(queue) > 0 {
		current := queue[0]
		queue = queue[1:]

		if current.Row == end[0] && current.Col == end[1] {
			return current.Steps
		}

		for _, dir := range directions {
			newRow := current.Row + dir[0]
			newCol := current.Col + dir[1]
			if newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
				!board[newRow][newCol] && !visited[newRow][newCol] {
				visited[newRow][newCol] = true
				queue = append(queue, Point{newRow, newCol, current.Steps + 1})
			}
		}
	}

	return 0
}

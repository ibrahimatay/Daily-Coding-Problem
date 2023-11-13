package com.ibrahimatay;

import java.util.LinkedList;
import java.util.Queue;

public class Problem23 {
    /*
    You are given an M by N matrix consisting of booleans that represents a board.
    Each True boolean represents a wall. Each False boolean represents a tile you
    can walk on.

    Given this matrix, a start coordinate, and an end coordinate, return the minimum
    number of steps required to reach the end coordinate from the start. If there is
    no possible path, then return null. You can move up, left, down, and right. You
    cannot move through walls. You cannot wrap around the edges of the board.

    For example, given the following board:
    ```
    [[f, f, f, f],
    [t, t, f, t],
    [f, f, f, f],
    [f, f, f, f]]
    ```
    and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number
    of steps required to reach the end is 7, since we would need to go through (1, 2)
    because there is a wall everywhere else on the second row.
    * */

    public int solution(boolean[][] board, int[] start, int[] end) {
        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        Point startPoint = new Point(start[0], start[1], 0);

        Queue<Point> queue = new LinkedList<>();
        queue.add(startPoint);

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            if (currentPoint.row == end[0] && currentPoint.col == end[1]) {
                return currentPoint.steps;
            }

            int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
            for (int[] dir : directions) {
                int newRow = currentPoint.row + dir[0];
                int newCol = currentPoint.col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !board[newRow][newCol] && !visited[newRow][newCol]) {
                    queue.add(new Point(newRow, newCol, currentPoint.steps + 1));
                    visited[newRow][newCol] = true;
                }
            }
        }

        return 0;
    }

    static class Point {
        int row;
        int col;
        int steps;

        Point(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }
}

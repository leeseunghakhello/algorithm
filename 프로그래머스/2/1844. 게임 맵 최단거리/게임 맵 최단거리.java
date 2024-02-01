import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 북, 남, 서, 동

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1}); // 시작 지점 (x, y, 거리)
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if (x == n - 1 && y == m - 1) { // 목적지 도달
                return distance;
            }

            for (int[] dir : directions) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if (maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        queue.add(new int[]{nextX, nextY, distance + 1});
                    }
                }
            }
        }

        return -1; // 도달할 수 없는 경우
    }
}

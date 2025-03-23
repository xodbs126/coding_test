package Chap20_graph_cycle;

import java.util.*;

public class organic_cabbage {
    static int[] dx = {0, 1, 0, -1}; // 우, 하, 좌, 상
    static int[] dy = {1, 0, -1, 0};
    static int M, N, K;
    static boolean[][] visited;
    static int[][] bugs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();

            bugs = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                bugs[y][x] = 1;
            }

            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (bugs[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int d = 0; d < 4; d++) {
                int x = nowX + dx[d];
                int y = nowY + dy[d];

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (bugs[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}

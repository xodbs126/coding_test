package Chap20_graph_cycle;

import java.util.*;

public class find_path {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static int[][] A;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        N = sc.nextInt();
        M = sc.nextInt();


        A = new int[N][M];
        visited = new boolean[N][M];


        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < M; j++) {
                A[i][j] = input.charAt(j) - '0';
            }
        }


        int result = bfs(0, 0);


        System.out.println(result);
    }

    private static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];


            if (nowX == N - 1 && nowY == M - 1) {
                return A[nowX][nowY];
            }


            for (int k = 0; k < 4; k++) {
                int x = nowX + dx[k];
                int y = nowY + dy[k];


                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (A[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[nowX][nowY] + 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
        return -1;
    }
}

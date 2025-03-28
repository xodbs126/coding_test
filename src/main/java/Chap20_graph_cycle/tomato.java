package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class tomato {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N, M;
    static boolean[][] visited;
    static int[][] tomato;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);

        tomato = new int[N][M];
        visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(inputs[j]);
                if (tomato[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int days = bfs(queue);

        System.out.println(days);
    }

    private static int bfs(Queue<int[]> queue) {
        int day = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                int[] now = queue.poll();
                int nowX = now[0];
                int nowY = now[1];

                for (int k = 0; k < 4; k++) {
                    int x = nowX + dx[k];
                    int y = nowY + dy[k];

                    if (x >= 0 && y >= 0 && x < N && y < M) {
                        if (!visited[x][y] && tomato[x][y] == 0) {
                            visited[x][y] = true;
                            tomato[x][y] = 1;
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
            }
        }

        return day;
    }
}

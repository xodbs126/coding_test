package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class organic_cabbage {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N,M, K;
    static boolean[][] visited;
    static boolean[][] cabbages;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbages = new boolean[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbages[y][x] = true;
            }

            for (int k = 0; k < N; k++) {
                for (int l = 0; l < M; l++) {
                    if (!visited[k][l] && cabbages[k][l]) {
                        visited[k][l] = true;
                        bfs(k, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int posX, int posY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{posX, posY});

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int nowX = node[0];
            int nowY = node[1];

            for (int i = 0; i < 4; i++) {
                int x = dx[i]+nowX;
                int y = dy[i]+nowY;

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && cabbages[x][y]) {
                        visited[x][y]= true;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}

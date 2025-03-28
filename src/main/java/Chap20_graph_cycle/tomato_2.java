package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class tomato_2 {
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] tomato;
    static boolean[][][] visited;
    static int N, M,Z;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());
        tomato = new int[N][M][Z];
        visited = new boolean[N][M][Z];
        Queue<int[]> queue = new LinkedList<>();
        for (int z = 0; z < Z; z++) {
            for (int x = 0; x < N; x++) {
                st = new StringTokenizer(br.readLine());
                for (int y = 0; y < M; y++) {
                    tomato[x][y][z] = Integer.parseInt(st.nextToken());
                    if (tomato[x][y][z] == 1) {
                        queue.offer(new int[]{x, y, z});
                        visited[x][y][z] = true;
                    }
                }
            }
        }
        int days = bfs(queue);

        for (int z = 0; z < Z; z++) {
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (tomato[x][y][z] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(days);
        }

    private static int bfs(Queue<int[]> queue) {
        int day=-1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                for (int j = 0; j < 6; j++) {
                    int x = poll[0] + dx[j];
                    int y = poll[1] + dy[j];
                    int z = poll[2] + dz[j];

                    if (x >= 0 && y >= 0 && z >= 0 && x < N && y < M && z < Z) {
                        if (!visited[x][y][z] && tomato[x][y][z] == 0) {
                            visited[x][y][z] = true;
                            tomato[x][y][z] = 1;
                            queue.offer(new int[]{x, y, z});
                        }
                    }
                }
            }


        }
        return day;
    }

}



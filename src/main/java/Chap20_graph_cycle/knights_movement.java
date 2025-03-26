package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class knights_movement {
    static int size;
    static int[][] movements =
            {{2, 1}, {2, -1},
            {-2, 1}, {-2, -1},
            {-1, 2}, {-1, -2},
            {1, 2}, {1, -2}};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());
            System.out.println(bfs(startX, startY, targetX, targetY));
        }
    }

    private static int bfs(int startX, int startY, int targetX, int targetY) {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[size][size];
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int posX = node[0];
            int posY = node[1];
            int moveCount = node[2];

            if (posX == targetX && posY == targetY) {
                return moveCount;
            }

            for (int i = 0; i < 8; i++) {
                int x = posX + movements[i][0];
                int y = posY + movements[i][1];

                if (x >= 0 && y >= 0 && x < size && y < size && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.offer(new int[]{x, y, moveCount + 1});
                }
            }
        }

        return -1;
    }
}
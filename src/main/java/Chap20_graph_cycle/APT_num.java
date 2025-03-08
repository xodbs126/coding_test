package Chap20_graph_cycle;

import java.io.*;
import java.util.*;

public class APT_num {
    static int length;
    static boolean[][] apt;
    static List<Integer> complexSizes = new ArrayList<>();

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        length = Integer.parseInt(br.readLine());
        apt = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            String line = br.readLine();
            for (int j = 0; j < length; j++) {
                apt[i][j] = (line.charAt(j) == '1');
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (apt[i][j]) {
                    complexSizes.add(bfs(i, j));
                }
            }
        }


        Collections.sort(complexSizes);
        bw.write(complexSizes.size() + "\n");
        for (int size : complexSizes) {
            bw.write(size + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        apt[x][y] = false;
        int count = 1;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cx = pos[0];
            int cy = pos[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < length && ny >= 0 && ny < length && apt[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    apt[nx][ny] = false;
                    count++;
                }
            }
        }
        return count;
    }
}

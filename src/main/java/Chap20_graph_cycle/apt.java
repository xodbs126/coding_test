package Chap20_graph_cycle;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class apt {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static boolean[][] visited;
    static int[][] apt;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count =0;
        List<Integer> aptCounts = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        apt = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                apt[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apt[i][j] == 1 && !visited[i][j]) {
//                  aptCounts.add(bfs(i, j));
                    aptCounts.add(dfs(i, j));
                    visited[i][j]=true;

                    count++;
                }
            }
        }
        System.out.println(count);
        Collections.sort(aptCounts);
        for (Integer aptCount : aptCounts) {
            System.out.println(aptCount);
        }
        

    }

    private static int bfs(int i, int j) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        int count_apt = 1;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int nowX = node[0];
            int nowY = node[1];

            for (int k = 0; k < 4; k++) {
                int x = dx[k] + nowX;
                int y = dy[k] + nowY;

                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (apt[x][y] == 1 && !visited[x][y]) {
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                        count_apt++;
                    }
                }
            }
        }
        return count_apt;
    }

    private static int dfs(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        int count_apt = 1;
        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            int nowX = node[0];
            int nowY = node[1];

            for (int k = 0; k < 4; k++) {
                int x = nowX + dx[k];
                int y = nowY + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (!visited[x][y] && apt[x][y] == 1) {
                        visited[x][y] = true;
                        stack.push(new int[]{x, y});
                        count_apt++;
                    }
                }
            }
        }
        return count_apt;
    }
}

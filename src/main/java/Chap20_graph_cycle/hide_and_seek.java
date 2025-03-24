package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class hide_and_seek {
    static int N, K;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        count = bfs(N,K);
        System.out.println(count);

    }

    private static int bfs(int start, int target) {
        visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start,0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int pos = node[0];
            int count = node[1];
            if (pos == target) return count;

            int[] move = {pos + 1, pos - 1, pos * 2};
            for (int i : move) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(new int[]{i,count+1});
                }
            }

        }
        return -1;
    }
}

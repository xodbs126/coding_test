package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class test {
    static int N, K;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        count = bfs(N, K);
        System.out.println(count);

    }

    private static int bfs(int start, int target) {
        visited = new boolean[100001];
        count =0;
        Queue<int[]> queue = new LinkedList<>();
        visited[start] = true;

        queue.offer(new int[]{start, count});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int pos = node[0];
            int count = node[1];
            if (pos == target) {
                return count;
            }
            int[] moves = {pos - 1, pos + 1, pos * 2};
            for (int next : moves) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next]=true;
                    queue.offer(new int[]{next, count+1});
                }
            }

        }
        return -1;
    }
}

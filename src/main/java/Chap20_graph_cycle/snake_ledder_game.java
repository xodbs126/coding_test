package Chap20_graph_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class snake_ledder_game {
    static int N, M;
    static boolean[] visited = new boolean[101];
    static int[] dist = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
        }

        bfs(graph);
        System.out.println(dist[100]);
    }

    private static void bfs(List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        dist[1] = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int dice = 1; dice <= 6; dice++) {
                int next = curr + dice;
                if (next > 100) continue;

                if (!graph.get(next).isEmpty()) {
                    next = graph.get(next).get(0);
                }

                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[curr] + 1;
                    queue.offer(next);
                }
            }
        }
    }
}

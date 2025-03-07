package Chap20_graph_cycle;

import java.io.*;
import java.util.*;

public class BFS_2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);


        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < M; i++) {
            String[] edge = br.readLine().split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        bfs(graph, R, N);

        bw.flush();
        bw.close();
        br.close();

    }

    private static void bfs(List<List<Integer>> graph, int start, int n) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int[] visitedOrder = new int[n + 1];
        int order = 1;

        queue.offer(start);
        visited[start] =true;
        visitedOrder[start] = order++;

        while (!queue.isEmpty()) {
            int node = queue.poll();


            Collections.sort(graph.get(node),Collections.reverseOrder());

            for (Integer neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                    visitedOrder[neighbor] = order++;
                }
            }

        }
        for (int i = 1; i <= n; i++) {
            bw.write(visitedOrder[i] + "\n");
        }


    }
}

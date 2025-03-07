package Chap20_graph_cycle;

import java.io.*;
import java.util.*;

public class BFS_DFS {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        List<List<Integer>> graph = new ArrayList<>();
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] value = br.readLine().split(" ");
            int node = Integer.parseInt(value[0]);
            int num = Integer.parseInt(value[1]);
            graph.get(num).add(node);
            graph.get(node).add(num);
        }

        dfs(graph, R, N);
        System.out.println();
        bfs(graph, R, N);

        bw.flush();
        bw.close();
        br.close();

    }

    private static void dfs(List<List<Integer>> graph, int start, int n) throws IOException {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n + 1];

        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");


                List<Integer> neighbors = graph.get(node);
                Collections.sort(neighbors,Collections.reverseOrder());
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }

            }
        }
    }
    private static void bfs(List<List<Integer>> graph, int start, int n) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");


                List<Integer> neighbors = graph.get(node);
                Collections.sort(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        queue.offer(neighbor);
                    }
                }

            }
        }
    }
}

package Chap20_graph_cycle;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(6);
        dfsStack(graph, 1, n);
    }

    public static void dfsStack(List<List<Integer>> graph, int start, int n) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n + 1];

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");


                List<Integer> neighbors = graph.get(node);
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}

package Chap20_graph_cycle;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int n = 6; // 노드 개수
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

        stack.push(start); // 시작 노드 스택에 추가

        while (!stack.isEmpty()) {
            int node = stack.pop(); // 스택에서 노드 꺼내기

            if (!visited[node]) {
                visited[node] = true; // 방문 처리
                System.out.print(node + " "); // 방문한 노드 출력


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

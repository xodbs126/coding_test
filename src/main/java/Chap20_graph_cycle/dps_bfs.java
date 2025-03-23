package Chap20_graph_cycle;

import java.util.*;

public class dps_bfs {
    static int node,edge,count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println(bfs(graph, 1, node));
    }

    private static int bfs(List<List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        count =0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int nodes = queue.poll();
            if (!visited[nodes]) {
                visited[nodes] = true;
            }

            List<Integer> neighbors = graph.get(nodes);

            for (Integer neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    count++;
                }
            }
        }
        return count;

    }


}

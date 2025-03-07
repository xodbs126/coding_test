package Chap20_graph_cycle;


import java.io.*;
import java.util.*;

public class DFS_3 {
    static int[] order;
    static int orderNum = 1;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int R = Integer.parseInt(inputs[2]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int node = Integer.parseInt(input[0]);
            int con = Integer.parseInt(input[1]);
            graph.get(node).add(con);
            graph.get(con).add(node);
        }


        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i),Collections.reverseOrder());
        }

        order = new int[N + 1];

        dfs(graph, R, N);

        for (int i = 1; i <= N; i++) {
            bw.write(order[i] + "\n");
        }

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
                order[node] = orderNum++;

                List<Integer> neighbors = graph.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}

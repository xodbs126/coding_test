package Chap20_graph_cycle;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DFS_2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        List<List<Integer>> graph = new ArrayList<>();


        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int R = Integer.parseInt(inputs[2]);

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


        dfs(graph, R, N);
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
                visited[node] =true;
                bw.write(node+"\n");

                List<Integer> neighbors = new ArrayList<>(graph.get(node));
                Collections.sort(neighbors, Collections.reverseOrder());

                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

    }
}

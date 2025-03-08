package Chap20_graph_cycle;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Virus {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> graph = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] values = br.readLine().split(" ");
            int node = Integer.parseInt(values[0]);
            int num = Integer.parseInt(values[1]);
            graph.get(node).add(num);
            graph.get(num).add(node);
        }

        bw.write(bfs(graph,1, N)+"");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int bfs(List<List<Integer>> graph, int start, int n) throws IOException {

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n + 1];
        int count=0;

        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                if (node != start)
                    count++;


                List<Integer> neighbors = graph.get(node);
                Collections.sort(neighbors,Collections.reverseOrder());
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return count;
    }
}

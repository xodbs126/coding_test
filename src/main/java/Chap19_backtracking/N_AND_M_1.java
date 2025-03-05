package Chap19_backtracking;
import java.io.*;

public class N_AND_M_1 {
    static int N, M;
    static boolean[] visited;
    static int[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        visited = new boolean[N + 1];
        result = new int[M];
        backtracking(0);

        bw.flush();
        bw.close();
    }

    public static void backtracking(int depth) throws IOException {
        if (depth == M) {
            for (int num : result) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }
}
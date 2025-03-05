package Chap19_backtracking;

import java.io.*;

public class N_AND_M_2 {
    static int N, M;
    static int[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        result = new int[M];

        backtracking(0, 1);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backtracking(int depth, int start) throws IOException {
        if (depth == M) {
            for (int i : result) {
                bw.write(i + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            result[depth] = i;
            backtracking(depth + 1, i + 1);
        }
    }
}

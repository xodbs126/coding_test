package Chap19_backtracking;

import java.io.*;

public class N_AND_M_3 {

    static int N,M;
    static int[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        result = new int[M];
        backtracking(0);
        bw.flush();
        bw.close();
        br.close();

    }

    private static void backtracking(int depth) throws IOException {
        if (depth == M) {
            for (int i : result) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= N; i++) {
            result[depth] = i;
            backtracking(depth+1);
        }
    }
}

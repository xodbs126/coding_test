package Chap19_backtracking;

import java.io.*;

public class N_AND_M_4 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] result;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        result = new int[M];
        backtracking(0,1);
        bw.flush();
        bw.close();
        br.close();

    }

    private static void backtracking(int depth, int start) throws IOException {
        if (M == depth) {
            for (int i : result) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = start; i <= N; i++) {
            result[depth] = i;
            backtracking(depth + 1, i);
        }
    }

}

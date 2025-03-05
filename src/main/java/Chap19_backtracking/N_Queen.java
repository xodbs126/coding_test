package Chap19_backtracking;

import java.io.*;

public class N_Queen {
    static int N;
    static int count = 0;
    static int[] col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N];
        backtrack(1);
        System.out.println(count);
    }

    static void backtrack(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int cols = 0; cols < N; cols++) {
            if (isSafe(row, cols)) {
                col[row] = cols;
                backtrack(row + 1);
            }
        }
    }
    static boolean isSafe(int row, int col_pos) {
        for (int i = 0; i < row; i++) {
            if (col[i] == col_pos || Math.abs(col[i] - col_pos) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}

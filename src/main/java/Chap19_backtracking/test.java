package Chap19_backtracking;

import java.util.Scanner;

public class test {
    static int N,M,R;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N + 1];
        result = new int[M];
        backtracking(0);
    }

    private static void backtracking(int depth) {
        if (depth == M) {
            for (int i : result) {
                System.out.println(i+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[i] = i;
                backtracking(depth + 1);
                visited[i]= false;
            }
        }
    }
}

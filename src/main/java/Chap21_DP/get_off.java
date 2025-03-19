package Chap21_DP;

import java.util.Scanner;

public class get_off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ti = new int[N];
        int[] Pi = new int[N];

        for (int i = 0; i < N; i++) {
            Ti[i] = sc.nextInt();
            Pi[i] = sc.nextInt();
        }

        int[] dp = new int[N+ 1];

        for (int i = N-1; i >= 0; i--) {
            if (i + Ti[i] <= N) {
                dp[i] = Math.max(dp[i + 1], Pi[i] + dp[i + Ti[i]]);
            } else dp[i] = dp[i + 1];
        }
        System.out.println(dp[0]);
    }
}

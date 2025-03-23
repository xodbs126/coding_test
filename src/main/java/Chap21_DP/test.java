package Chap21_DP;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n];
        int[] nums = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        for (int i = 0; i < m; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 == 1) {
                System.out.println(dp[num2 - 1]);
            } else {
                System.out.println(dp[num2 - 1] - dp[num1 - 2]);
            }

        }


    }

}

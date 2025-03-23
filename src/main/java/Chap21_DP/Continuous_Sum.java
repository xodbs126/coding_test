package Chap21_DP;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Continuous_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        func(arr);
    }

    private static void func(int[] arr) {
        int[] dp = new int[arr.length];
        int sum=0;

        dp[0] = arr[0];
        int max= dp[0];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}

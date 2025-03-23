package Chap21_DP;

import java.util.Scanner;

public class triangle {
        static int[][] triangle;
        static int[][] dp;
        static int n;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            triangle = new int[n][n];
            dp = new int[n][n];


            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = sc.nextInt();
                    dp[i][j] = -1;
                }
            }

            System.out.println(findMaxSum(0, 0));

            sc.close();
        }


        static int findMaxSum(int i, int j) {

            if (i == n - 1) return triangle[i][j];

            if (dp[i][j] != -1) return dp[i][j];

            dp[i][j] = triangle[i][j] + Math.max(findMaxSum(i + 1, j), findMaxSum(i + 1, j + 1));

            return dp[i][j];
        }
    }


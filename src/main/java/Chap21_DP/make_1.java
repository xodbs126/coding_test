package Chap21_DP;


import java.util.Scanner;

import static java.lang.Math.min;

public class make_1 {


        static int[] dp;
        static int N;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            N = sc.nextInt();
            dp = new int[N + 1];
            func();
        }

        private static void func() {

            dp[1] = 0;
            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i-1]+1;
                if(i%2 ==0) dp[i]= min(dp[i], dp[i / 2] + 1);
                if(i%3 ==0) dp[i] =min(dp[i], dp[i / 3] + 1);
            }
            System.out.println(dp[N]);
        }

    }

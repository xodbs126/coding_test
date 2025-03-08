package Chap21_DP;

import java.io.*;

public class fibonacci_num_1 {
    static int count_fib = 0;
    static int count_fibonacci = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        fib(num);
        fibonacci(num);

        bw.write(count_fib +" "+count_fibonacci);
        bw.flush();
        bw.close();
        br.close();

    }

    private static long fibonacci(int n) {
        if (n <= 2) return 1;

        long[] dp = new long[n + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            count_fibonacci++;
        }
        return dp[n];
    }

    private static int fib(int num) {

        if (num == 1 || num == 2) {
            count_fib++;
            return 1;
        } else {
            return (fib(num - 1) + fib(num - 2));
        }
    }
}

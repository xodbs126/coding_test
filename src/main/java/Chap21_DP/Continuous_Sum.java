package Chap21_DP;

import java.io.*;
import java.util.StringTokenizer;

public class Continuous_Sum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        contin(n);
        bw.flush();
        bw.close();
        br.close();

    }

    private static void contin(int n) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
        }

        int max = dp[0];
        int sum = dp[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + dp[i], dp[i]);
            max = Math.max(max, sum);
        }

        bw.write(max+"");
    }
}

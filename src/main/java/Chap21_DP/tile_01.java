package Chap21_DP;

import java.io.*;

public class tile_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            bw.write(1+"");
            return;
        } else if (N == 2) {
            bw.write(2+"");
            return;
        }

        long[] dp = new long[N + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        bw.write(dp[N]+"");
        bw.flush();
        bw.close();
        br.close();

    }
}

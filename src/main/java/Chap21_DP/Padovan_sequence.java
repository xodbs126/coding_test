package Chap21_DP;

import java.io.*;

public class Padovan_sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            bw.write(padovan(Integer.parseInt(br.readLine())) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int padovan(int num) {
        if (num == 1 || num == 2 || num == 3) {
            return 1;
        }

        int[] dp = new int[num + 1];
        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i <= num; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        return dp[num];
    }
}

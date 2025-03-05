package Chap17_combination;

import java.io.*;

public class put_bridge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        while (count-- > 0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            bw.write(combination(M, N) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static long combination(int M, int N) {
        if (N > M - N)
            N = M - N;

        long result = 1;

        for (int i = 0; i < N; i++) {
            result *= (M - i);
            result /= (i + 1);
        }
        return result;
    }
}


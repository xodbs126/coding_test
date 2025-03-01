package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class least_common_multiple {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            int min = Math.min(A, B);
            int max = Math.max(A, B);
            int lcm = max;

            while (lcm % min != 0) lcm += max;

            bw.write(lcm + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}


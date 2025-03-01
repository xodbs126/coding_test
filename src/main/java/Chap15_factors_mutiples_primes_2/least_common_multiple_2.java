package Chap15_factors_mutiples_primes_2;

import java.io.*;

import static java.lang.Math.*;

public class least_common_multiple_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);

        long min = min(A, B);
        long max = max(A, B);
        long lcm = max;

        while (lcm % min != 0) lcm += max;

        bw.write(lcm + "");

        bw.flush();
        bw.close();
        br.close();
    }
}

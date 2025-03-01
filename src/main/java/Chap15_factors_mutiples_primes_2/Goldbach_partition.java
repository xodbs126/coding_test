package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class Goldbach_partition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];

        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(partition(num, isPrime) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int partition(int num, boolean[] isPrime) {
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime[i] && isPrime[num - i]) {
                count++;
            }
        }
        return count;
    }
}

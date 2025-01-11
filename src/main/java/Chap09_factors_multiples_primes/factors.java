package Chap09_factors_multiples_primes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = N; i <= M; i++) {
            if (is_prime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean is_prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
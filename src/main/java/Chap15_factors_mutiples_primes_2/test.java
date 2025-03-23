package Chap15_factors_mutiples_primes_2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int end = n*2;
            if (n != 0) {
                System.out.println(func(n,end));
            }

        }

    }

    private static int func(int n,int end) {
        int count=0;
        while(n<=end) {
            if (n != 1) {
                n++;
                continue;
            }

            if (n == 2) {
                count++;
                n++;
            }
            if (n % 2 == 0) continue;
            for (int i = 3; i * i < n; i += 2) {
                if (n % i == 0) {
                    count++;
                }
            }

        }
        return count;
    }

}

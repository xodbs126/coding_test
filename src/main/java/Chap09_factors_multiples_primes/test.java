package Chap09_factors_multiples_primes;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int div =2;
        while (n != 1) {
            if(n%div==0) {
                n /= div;
                System.out.println(div);
            } else div++;
        }

        }

    private static boolean factor(int num) {
        if(num==1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package Chap17_combination;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            func(n,m);
        }



    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void func(int n, int m) {
        int sum=1;

        if (n > m) {
            while (m > 0) {
                sum *= n;
                sum /= m;
                n--;
                m--;
            }
        }else if (n == m) {
                sum=1;
            }else{ while (n > 0) {
            sum *= m;
            sum /= n;
            m--;
            n--;

            }

                }
        System.out.println(sum);
        }

    }


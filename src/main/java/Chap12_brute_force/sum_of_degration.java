package Chap12_brute_force;

import java.util.Scanner;

public class sum_of_degration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rs=0;
        for (int i = 1; i < n; i++) {
            int sum =i;
            int A = i;

            while (A > 0) {
                sum += A % 10;
                A/=10;
            }
            if (n == sum) {
                rs=i;
                break;
            }
        }
        System.out.println(rs);
    }
}

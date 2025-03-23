package Chap08_math;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int height = a-b;
        int target = v-a;
        int days=1;

        while (target >0) {
            target -= height;
            days++;
        }

        System.out.println(days);
    }
}

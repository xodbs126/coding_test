package Chap01_IO;

import java.util.Scanner;

public class Multiplication_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int firstNum = B / 100;
        int secondNum = (B%100)/10;
        int thirdNum = (B%100)%10;

        System.out.println(A*thirdNum);
        System.out.println(A*secondNum);
        System.out.println(A*firstNum);
        System.out.println(A*B);

    }
}

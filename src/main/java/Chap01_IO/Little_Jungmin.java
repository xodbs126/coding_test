package Chap01_IO;

/***
 * 입력
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 *
 * 출력
 * A+B+C의 값을 출력한다.
 */

import java.util.Scanner;

public class Little_Jungmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();

        System.out.println(A+B+C);
    }
}

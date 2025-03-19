package Chap21_DP;

import java.util.Scanner;

public class distributed_processing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 각 숫자(1~10)에 대해 거듭제곱의 마지막 자리가 반복되는 패턴
        int[][] lastDigitPatterns = {
                {0},               // 0의 거듭제곱: 항상 0
                {1},               // 1의 거듭제곱: 항상 1
                {2, 4, 8, 6},      // 2의 거듭제곱: 2, 4, 8, 6 (반복)
                {3, 9, 7, 1},      // 3의 거듭제곱: 3, 9, 7, 1 (반복)
                {4, 6},            // 4의 거듭제곱: 4, 6 (반복)
                {5},               // 5의 거듭제곱: 항상 5
                {6},               // 6의 거듭제곱: 항상 6
                {7, 9, 3, 1},      // 7의 거듭제곱: 7, 9, 3, 1 (반복)
                {8, 4, 2, 6},      // 8의 거듭제곱: 8, 4, 2, 6 (반복)
                {9, 1}             // 9의 거듭제곱: 9, 1 (반복)
        };

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int lastDigit = a % 10;

            int[] pattern = lastDigitPatterns[lastDigit];

            int patternLength = pattern.length;
            int index = (b % patternLength) - 1;

            if (index == -1) {
                index = patternLength - 1;
            }

            System.out.println(pattern[index]);
        }

        sc.close();
    }
}

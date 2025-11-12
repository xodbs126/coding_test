

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] space = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    space[j][k] = sc.nextInt();
                }
            }
            System.out.print("#" + i+" ");
            Solutions.solution(N, K, space);
        }
    }
}
class Solutions {
    public static void solution(int N, int K, int[][] space) {

        int totalCount = 0;


        for (int i = 0; i < N; i++) {
            int sequence = 0;
            for (int j = 0; j < N; j++) {
                if (space[i][j] == 1) {
                    sequence++;
                } else {
                    if (sequence == K) {
                        totalCount++;
                    }
                    sequence = 0;
                }
            }
            if (sequence == K) {
                totalCount++;
            }
        }

        for (int j = 0; j < N; j++) {
            int sequence = 0;
            for (int i = 0; i < N; i++) {
                if (space[i][j] == 1) {
                    sequence++;
                } else {
                    if (sequence == K) {
                        totalCount++;
                    }
                    sequence = 0;
                }
            }
            if (sequence == K) {
                totalCount++;
            }
        }

        System.out.println(totalCount);
    }
}
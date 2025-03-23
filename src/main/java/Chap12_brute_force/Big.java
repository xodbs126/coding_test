package Chap12_brute_force;

import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] body = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                body[i][j] = sc.nextInt();
            }
        }
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            int count=1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (body[j][0] > body[i][0] && body[j][1] > body[i][1]) {
                    count++;
                }
                rank[i] = count;
            }
        }

        for (int i : rank) {
            System.out.print(i+" ");
        }

    }
}

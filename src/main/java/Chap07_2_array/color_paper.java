package Chap07_2_array;

import java.util.Scanner;

public class color_paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100];
        int n = sc.nextInt();
        int count=0;

        for (int i = 0; i < n; i++) {
            int cols = sc.nextInt();
            int rows = sc.nextInt();

            for (int j = cols; j < cols + 10; j++) {
                for (int k = rows; k < rows + 10; k++) {
                    paper[j][k] = true;
                }
            }


        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}

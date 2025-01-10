package Chap07_2_array;

import java.io.*;

public class confetti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        boolean[][] area = new boolean[100][100];

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int rows = Integer.parseInt(input[0]);
            int cols = Integer.parseInt(input[1]);


            for (int r = rows; r < rows + 10; r++) {
                for (int c = cols; c < cols + 10; c++) {
                    area[r][c] = true;
                }
            }
        }
        int Area = 0;
        for (int r = 0; r < 100; r++) {
            for (int c = 0; c < 100; c++) {
                if (area[r][c]) {
                    Area++;
                }
            }
        }

        System.out.println(Area);
    }
}
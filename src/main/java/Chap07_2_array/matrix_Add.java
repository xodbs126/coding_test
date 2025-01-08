package Chap07_2_array;

/***
 * 문제
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 */

import java.io.*;

public class matrix_Add {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] input1 = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = Integer.parseInt(input1[j]);
            }
        }


        for (int i = 0; i < rows; i++) {
            String[] input2 = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = Integer.parseInt(input2[j]);
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                bw.write(sum[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

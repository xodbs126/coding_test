package Chap04_1_array;

/***
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

import java.io.*;

public class max_Min {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());


        String[] input = br.readLine().split(" ");
        int min = Integer.parseInt(input[0]);
        int max = min;

        for (int i = 1; i < count; i++) {
            int num = Integer.parseInt(input[i]);
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        bw.write(min+" "+max);
        bw.flush();
        bw.close();

    }
}

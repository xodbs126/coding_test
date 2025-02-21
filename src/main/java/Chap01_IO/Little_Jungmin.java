package Chap01_IO;

/***
 * 입력
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 *
 * 출력
 * A+B+C의 값을 출력한다.
 */

import java.io.*;
import java.util.Scanner;

public class Little_Jungmin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int sum=0;

        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i]);
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

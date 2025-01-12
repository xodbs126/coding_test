package Chap10_geometry;

/***
 * 문제
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 x, y, w, h가 주어진다.
 *
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 */

import java.io.*;

public class escape_Rectangular {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int x_w = w - x;
        int y_h = h - y;

        int min = Math.min(Math.min(x,y),Math.min(x_w,y_h));

        bw.write(min + " ");
        bw.flush();
        bw.close();
        br.close();

    }
}

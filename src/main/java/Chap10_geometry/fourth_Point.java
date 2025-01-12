package Chap10_geometry;

/***
 * 문제
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 *
 * 입력
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 *
 * 출력
 * 직사각형의 네 번째 점의 좌표를 출력한다.
 */

import java.io.*;
import java.util.*;

public class fourth_Point {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받기
        int[][] points = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int x4 = 0, y4 = 0;


        if (points[0][0] == points[1][0]) {
            x4 = points[2][0];
        } else if (points[0][0] == points[2][0]) {
            x4 = points[1][0];
        } else {
            x4 = points[0][0];
        }

        if (points[0][1] == points[1][1]) {
            y4 = points[2][1];
        } else if (points[0][1] == points[2][1]) {
            y4 = points[1][1];
        } else {
            y4 = points[0][1];
        }


        bw.write(x4 + " " + y4 + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}

package Chap10_geometry;

/***
 * 문제
 * 창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
 *
 * 삼각형의 세 각을 입력받은 다음,
 *
 * 세 각의 크기가 모두 60이면, Equilateral
 * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 세 각의 합이 180이 아닌 경우에는 Error
 * 를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.
 *
 * 출력
 * 문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
 */

import java.io.*;

public class memorize_Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());

        int sum =n1+n2+n3;
        if (sum != 180) {
            bw.write("Error");
        } else {
            if (n1 == 60 && n2 == 60) {
                bw.write("Equilateral");
            } else if (n1 != n2 && n1 != n3 && n2!=n3) {
                bw.write("Scalene");
            }else
                bw.write("Isosceles");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

package Chap08_math;
/***
 * 진법 변환 2
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 0.5 초 (추가 시간 없음)	256 MB	64752	30081	25844	46.213%
 * 문제
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.
 *
 * 출력
 * 첫째 줄에 10진법 수 N을 B진법으로 출력한다.
 */

import java.io.*;

public class translate_format2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int line = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        String translate = Integer.toString(line, N);

        bw.write(translate.toUpperCase() + "\n");
        bw.flush();
        bw.close();
    }
}

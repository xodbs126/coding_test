package Chap05_String;

/***
 * 문제
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */

import java.io.*;

public class count_Word_Length {
    public static void main(string_Arr[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        bw.write(String.valueOf(word.length()));
        bw.flush();
        bw.close();
        br.close();
    }
}

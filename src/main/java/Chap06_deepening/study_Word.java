package Chap06_deepening;

import java.io.*;

/***
 * 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

public class study_Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        int[] alphabet = new int[26];
        int max=0;
        int maxIdx = -1;

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'A']++;
        }


        for (int j = 0; j < alphabet.length; j++) {
            if (max < alphabet[j]) {
                max = alphabet[j];
                maxIdx = j;
            } else if (max == alphabet[j]) {
                maxIdx = -1;
            }
        }

        if (maxIdx == -1) {
            bw.write("?");
        } else {
            bw.write((char) ('A' + maxIdx));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

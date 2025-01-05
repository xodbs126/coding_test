package Chap05_String;

import java.io.*;

public class charactor_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr = br.readLine();
        int num = Integer.parseInt(br.readLine());

        bw.write(arr.charAt(num-1));
        bw.flush();
        bw.close();
        br.close();

    }
}

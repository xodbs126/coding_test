package Chap17_combination;

import java.io.*;

public class green_tower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int level = Integer.parseInt(br.readLine());

        bw.write((int)Math.pow(2, level) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

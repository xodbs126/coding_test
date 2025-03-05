package Chap17_combination;

import java.io.*;

public class Bella_fashion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int result = count*(count-1);

        bw.write(count*(count-1)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

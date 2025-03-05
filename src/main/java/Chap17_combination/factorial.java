package Chap17_combination;

import java.io.*;

public class factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int sum=1;

        while (count > 0) {
            sum*=count--;
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

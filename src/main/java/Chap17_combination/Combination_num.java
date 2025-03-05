package Chap17_combination;

import java.io.*;

public class Combination_num {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        double sum=1;
        while (K > 0) {
            sum*=N--;
            sum/=K;
            K--;
        }
        bw.write((int)sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

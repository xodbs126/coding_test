package Chap11_time_complexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class asymptotic_Notation {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int a1 = Integer.parseInt(input[0]);
        int a0 = Integer.parseInt(input[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if((a1*n0 + a0 <= c*n0) && c>=a1) System.out.println(1);
        else System.out.println(0);

        br.close();
    }
}
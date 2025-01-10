package Chap08_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mid_transmit_Algorithm {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = (int) (Math.pow(2, n) + 1);
        k = k*k;
        System.out.println(k);
    }
}

package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class fraction_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        int first_numerator = Integer.parseInt(input1[0]);
        int first_denominator = Integer.parseInt(input1[1]);

        String[] input2 = br.readLine().split(" ");
        int second_numerator = Integer.parseInt(input2[0]);
        int second_denominator = Integer.parseInt(input2[1]);


        int numerator = first_numerator * second_denominator + first_denominator * second_numerator;
        int denominator = first_denominator * second_denominator;

        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        numerator /= gcd;
        denominator /= gcd;

        bw.write(numerator + " " + denominator+"\n");


        bw.flush();
        br.close();
        bw.close();
    }
}

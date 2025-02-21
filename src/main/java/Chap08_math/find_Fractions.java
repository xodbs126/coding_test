package Chap08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class find_Fractions {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int line = 1;
        int sum = 0;


        while (sum + line < N) {
            sum += line;
            line++;
        }
        int position = N - sum;

        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = position;
            denominator = line - position + 1;
        } else {
            numerator = line - position + 1;
            denominator = position;
        }

        System.out.printf("%d/%d\n", numerator, denominator);
    }
}
package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class roadside_trees {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int trees=0;

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int[] width = new int[count - 1];

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < width.length; i++) {
            width[i] = arr[i + 1] - arr[i];
        }

        int gcd = gcd_mulitple(width);

        for (int i = 0; i < width.length; i++) {
            trees+=width[i]/gcd -1;
        }

        bw.write(trees + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int gcd_mulitple(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }

        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b=a%b;
            a = temp;
        }
        return a;
    }
}

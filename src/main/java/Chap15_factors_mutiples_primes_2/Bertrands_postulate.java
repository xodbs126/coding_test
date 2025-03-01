package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class Bertrands_postulate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());
        while (num != 0) {
            int count=0;
            for (int i = num+1; i <= 2 * num; i++) {
                if (is_prime(i)) {
                    count++;
                }
            }
            bw.write(count + "\n");
            num = Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
        br.close();


    }

    private static boolean is_prime(int num) {
        if(num<2) return false;
        if(num == 2 || num == 3) return true;
        if(num%2==0) return false;

        for (int i = 2; i * i <= num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}

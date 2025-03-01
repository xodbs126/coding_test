package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class next_factor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            long num = Long.parseLong(br.readLine())+1;

            while(!is_prime(num)){
                num++;
            }
            bw.write(num + "\n");

        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean is_prime(Long num) {
        if(num<2) return false;
        if(num == 2 || num == 3) return true;
        if(num%2 ==0 ) return false;

        for (int i = 3; (long) i * i <= num; i += 2) {
            if(num%i ==0) return false;
        }
        return true;
    }
}

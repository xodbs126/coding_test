package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class find_factor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            if (is_prime(i)) {
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean is_prime(int num) {
        if(num<2) return false;
        if(num == 2 || num == 3) return true;
        if(num%2 ==0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if(num%i==0) return false;
        }
        return true;
    }
}

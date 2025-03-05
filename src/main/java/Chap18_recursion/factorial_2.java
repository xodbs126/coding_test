package Chap18_recursion;

import java.io.*;

public class factorial_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        long result = factorial(count);
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static long factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);

    }
}

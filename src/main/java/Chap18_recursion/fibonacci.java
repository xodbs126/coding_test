package Chap18_recursion;

import java.io.*;

public class fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int result = find_fibonacci(count);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int find_fibonacci(int count) {

        if (count <= 1) return count;

        return find_fibonacci(count - 1) + find_fibonacci(count - 2);
    }
}

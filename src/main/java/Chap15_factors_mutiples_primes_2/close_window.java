package Chap15_factors_mutiples_primes_2;

import java.io.*;

public class close_window {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int opened_window = 0;
        boolean[] windows = new boolean[count + 1];

        for (int i = 1; i <= count; i++) {
            window(i, windows);
        }

        for (int i = 1; i <= count; i++) {
            if (windows[i]) opened_window++;
        }

        bw.write(opened_window + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void window(int num, boolean[] windows) {
        for (int i = num; i < windows.length; i += num) {
            windows[i] = !windows[i];
        }
    }
}

package Chap03_loop;

import java.io.*;

public class add_AB_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bw.write("Case #" + (i + 1) + ": " + (A + B) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

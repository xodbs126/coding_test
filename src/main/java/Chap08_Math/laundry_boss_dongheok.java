package Chap08_Math;

import java.io.*;

public class laundry_boss_dongheok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int charge = Integer.parseInt(br.readLine());
            int[] arr = new int[4];

            arr[0] = charge / 25;
            charge %= 25;
            arr[1] = charge / 10;
            charge %= 10;
            arr[2] = charge / 5;
            charge %= 5;
            arr[3] = charge;


            bw.write(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

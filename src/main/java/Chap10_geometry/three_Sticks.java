package Chap10_geometry;

import java.io.*;

public class three_Sticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n3 = Integer.parseInt(input[2]);

        int[] sticks = {n1, n2, n3};

        java.util.Arrays.sort(sticks);

        int min = sticks[0];
        int mid = sticks[1];
        int max = sticks[2];
        int sum =0;

        while (max >= min + mid) {
            max = mid+min-1;
        }
        sum = min +mid+max;
        bw.write(sum+"");

        bw.flush();
        bw.close();
        br.close();
    }
}

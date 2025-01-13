package Chap10_geometry;

import java.io.*;

public class triangle_and_Sides {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];

        while (true) {
            String[] input = br.readLine().split(" ");
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(input[i]);
                sum += arr[i];
            }

            if (sum == 0) break;

            int max = Math.max(Math.max(arr[1], arr[0]), arr[2]);
            int min = Math.min(Math.min(arr[1], arr[0]), arr[2]);
            int mid = sum - max - min;


            if (max >= min + mid) {
                bw.write("Invalid\n");
            } else if (max == min && max == mid) {
                bw.write("Equilateral\n");
            } else if (max == mid || mid == min) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }
        bw.flush();
    }
}
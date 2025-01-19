package Chap13_sort;

import java.io.*;
import java.util.Arrays;

public class sort_in_Side {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--) {
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
        }
    }
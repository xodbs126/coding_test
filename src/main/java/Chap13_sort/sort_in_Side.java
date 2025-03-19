package Chap13_sort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class sort_in_Side {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }
//        String[] arr = br.readLine().split("");

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--) {
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
        }
    }
package Chap23_deepening_2;

import java.io.*;
import java.util.*;

public class divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int N = min * max;
        System.out.println(N);
    }
}
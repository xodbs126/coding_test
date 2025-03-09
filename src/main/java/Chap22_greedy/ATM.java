package Chap22_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        int[] sum = new int[N+1];
        int total = 0;

        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        for (int i = 0; i < N; i++) sum[i + 1] = time[i] + sum[i];

        for (int i : sum) total += i;

        System.out.println(total);

        sc.close();

    }
}

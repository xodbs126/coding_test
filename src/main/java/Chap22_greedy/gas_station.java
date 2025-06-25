package Chap22_greedy;

import java.io.*;
import java.util.Scanner;

public class gas_station {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] distance = new long[N-1];
        long[] oil_cost = new long[N];


        for (int i = 0; i < N - 1; i++) {
            distance[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            oil_cost[i] = sc.nextLong();
        }
        long min = oil_cost[0];
        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            if(min>oil_cost[i]){
                min = oil_cost[i];
            }
            sum += min*distance[i];
        }
        System.out.println(sum);
    }

}
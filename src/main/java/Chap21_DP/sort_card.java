package Chap21_DP;

import java.util.*;

public class sort_card {
    static int N, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int sum=0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            queue.add(num);
        }
        while (queue.size()!=1) {
            int data = queue.poll();
            int data2 = queue.poll();
            int cost = data + data2;
            sum+=cost;
            queue.add(cost);
        }
        System.out.println(sum);
    }
}

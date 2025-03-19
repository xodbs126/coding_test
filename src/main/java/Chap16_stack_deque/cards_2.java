package Chap16_stack_deque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cards_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            cards.offer(i);
        }

        while (cards.size() > 1) {
            cards.poll();

            Integer next = cards.poll();
            if (next != null) {
                cards.offer(next);
            }
        }
        System.out.println(cards.peek());
    }
}

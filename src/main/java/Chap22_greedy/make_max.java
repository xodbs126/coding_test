package Chap22_greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class make_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> plusqueue = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 (큰 값 우선)
        PriorityQueue<Integer> minusqueue = new PriorityQueue<>(); // 오름차순 (작은 값 우선)
        int oneCount = 0; // 1의 개수를 세기 위한 변수
        int zeroCount = 0; // 0의 개수를 세기 위한 변수
        int sum = 0;

        // 입력받아서 분류
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > 1) plusqueue.add(num); // 2 이상 양수는 내림차순 정렬
            else if (num < 0) minusqueue.add(num); // 음수는 오름차순 정렬
            else if (num == 1) oneCount++; // 1의 개수 저장 (더하는 것이 유리)
            else zeroCount++; // 0의 개수 저장 (음수와 곱할 때 유리)
        }

        // 1의 개수는 그냥 더하기
        sum += oneCount;

        // 양수 처리 (큰 수부터 두 개씩 묶어서 곱하기)
        while (plusqueue.size() > 1) {
            int first = plusqueue.poll();
            int second = plusqueue.poll();
            sum += first * second; // 곱하는 것이 더 큼
        }
        if (!plusqueue.isEmpty()) {
            sum += plusqueue.poll(); // 남은 하나 더하기
        }

        // 음수 처리 (작은 수부터 두 개씩 묶어서 곱하기)
        while (minusqueue.size() > 1) {
            int first = minusqueue.poll();
            int second = minusqueue.poll();
            sum += first * second; // 음수끼리 곱하면 양수가 됨
        }
        if (!minusqueue.isEmpty() && zeroCount == 0) { // 음수가 남았고, 0이 없을 때만 더하기
            sum += minusqueue.poll();
        }

        // 최종 결과 출력
        System.out.println(sum);
    }
}

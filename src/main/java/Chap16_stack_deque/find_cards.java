package Chap16_stack_deque;

import java.util.Arrays;
import java.util.Scanner;

public class find_cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] target = new int[m];

        for (int i = 0; i < m; i++) {
            target[i] = sc.nextInt();
        }

        Arrays.sort(cards);

        for (int i = 0; i < m; i++) {
            if (binarySearch(cards, target[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }


    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

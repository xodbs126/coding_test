package Chap13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class meeting_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 0;
        int endTime = 0;
        for (int i = 0; i < n; i++) {
            if (meetings[i][0] >= endTime) {
                endTime = meetings[i][1];
                count++;
            }


        }
        System.out.println(count);
    }
}



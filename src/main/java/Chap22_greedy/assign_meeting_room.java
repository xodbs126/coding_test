package Chap22_greedy;

import java.util.*;

public class assign_meeting_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        Arrays.sort(meetings, (a, b) -> (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1]);

        int count = 0;
        int endTime = 0;

        for (int[] meeting : meetings) {
            if (meeting[0] >= endTime) {
                endTime = meeting[1];
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

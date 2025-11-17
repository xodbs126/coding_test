import java.util.Scanner;

public class Solution {
    static int N, L;
    static int[] scores;
    static int[] cals;
    static int maxScore;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            L = sc.nextInt();

            scores = new int[N];
            cals = new int[N];
            maxScore = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                cals[i] = sc.nextInt();
            }

            dfs(0, 0, 0);

            System.out.println("#" + test_case + " " + maxScore);
        }
    }

    public static void dfs(int idx, int sumScore, int sumCal) {

        if (sumCal > L) {
            return; 
        }

        maxScore = Math.max(maxScore, sumScore);

        if (idx == N) {
            return;
        }

        dfs(idx + 1, sumScore + scores[idx], sumCal + cals[idx]);

        dfs(idx + 1, sumScore, sumCal);
    }
}
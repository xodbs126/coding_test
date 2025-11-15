import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=t;i++){
            Solution1.solution(i,sc);
        }
    }
    private static class Solution1 {
        public static void solution(int n, Scanner sc) {
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(n).append(" ");

            int N = sc.nextInt();
            int M = sc.nextInt();
            int max = 0;
            int[] score = new int[N + M+1];

            for (int i = 1; i <= N; i++) {
                for(int j = 1; j <= M; j++) {
                    score[i + j]++;
                }
            }

            for(int i = 1; i < score.length; i++) {
                max = Math.max(max, score[i]);
            }

            for(int i = 1; i<score.length; i++) {
                if (score[i] == max) {
                    sb.append(i).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}
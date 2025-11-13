import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            Solution1.solution(i,n);
        }
    }

    private static class Solution1 {
        public static void solution(int i, int n) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(i).append(" ");

            count = n / 3;
            sb.append(n / 3);

            System.out.println(sb.toString());
        }
    }
}

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
            int length  = sc.nextInt();
            sc.nextLine();
            String problem = sc.nextLine();
            String input = sc.nextLine();
            int count =0;

            for (int i = 0; i < length; i++) {
                char c =  problem.charAt(i);
                char inputChar =  input.charAt(i);

                if(c==inputChar){
                    count++;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(n).append(" ").append(count);

            System.out.println(sb.toString());
        }
    }
}

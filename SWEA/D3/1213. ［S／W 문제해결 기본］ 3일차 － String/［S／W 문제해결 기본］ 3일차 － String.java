import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();

        for(int i=1;i<=10;i++){
            Solution1.solution(i,sc);
        }
    }

    private static class Solution1 {
        public static void solution(int n, Scanner sc) {
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(n).append(" ");
            sc.nextLine();
            String s = sc.nextLine();
            String str = sc.nextLine();
            int count =0;

            String s1 = str.replaceAll(s, "*");

            for(int i=0;i<s1.length();i++){
                if (s1.charAt(i) == '*') {
                    count++;
                }
            }
            sb.append(count);

            System.out.println(sb.toString());
        }
    }
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            
            int n = sc.nextInt();

            long totalSum = 0;
            int maxA = 0;

            for (int i = 0; i < n; i++) {
                int currentA = sc.nextInt();
                
                totalSum += currentA;
                
                if (currentA > maxA) {
                    maxA = currentA;
                }
            }
           
            long answer = (long)n + totalSum + (long)maxA;

            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
}
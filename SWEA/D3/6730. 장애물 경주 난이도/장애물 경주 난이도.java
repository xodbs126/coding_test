import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            Solution1.solution(i,sc);
        }
    }

    private static class Solution1 {
        public static void solution(int n, Scanner sc) {
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(n).append(" ");
            int x = sc.nextInt();
            int[] arr = new int[x];
            int max = 0;

            int min = 0;

            for (int i = 0; i < x; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < x-1; i++) {
                if(arr[i]>arr[i+1]){
                    int up = arr[i] - arr[i + 1];
                    max = Math.max(max,up);
                }

                if(arr[i]<arr[i+1]){
                    int down = arr[i+1]-arr[i];
                    min = Math.max(min,down);
                }



            }
            sb.append(min).append(" ").append(max).append(" ");
            System.out.println(sb.toString());
        }
    }
}

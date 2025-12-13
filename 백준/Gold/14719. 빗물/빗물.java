
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            int[] block = new int[w];


            for (int i = 0; i < w; i++) {
                block[i] = sc.nextInt();
            }

            int totalWater = 0;


            for (int i = 1; i < w - 1; i++) {
                int current = block[i];
                int leftMax = 0;
                int rightMax = 0;


                for (int k = 0; k < i; k++) {
                    leftMax = Math.max(leftMax, block[k]);
                }

                for (int k = i + 1; k < w; k++) {
                    rightMax = Math.max(rightMax, block[k]);
                }


                int minWall = Math.min(leftMax, rightMax);

                if (minWall > current) {
                    totalWater += (minWall - current);
                }
            }

            System.out.println(totalWater);
        }
    }
}

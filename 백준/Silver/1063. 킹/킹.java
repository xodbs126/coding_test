

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {

            String king = sc.next();
            int kingX = king.charAt(0) - 'A';
            int kingY = king.charAt(1) - '1';

            String stone = sc.next();
            int stoneX = stone.charAt(0) - 'A';
            int stoneY = stone.charAt(1) - '1';

            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                String command = sc.next();

                int nextKX = kingX;
                int nextKY = kingY;
                int nextSX = stoneX;
                int nextSY = stoneY;
                
                if (command.equals("R")) {
                    nextKX++;
                } else if (command.equals("L")) {
                    nextKX--;
                } else if (command.equals("B")) {
                    nextKY--;
                } else if (command.equals("T")) {
                    nextKY++;
                } else if (command.equals("RT")) {
                    nextKX++;
                    nextKY++;
                } else if (command.equals("LT")) {
                    nextKX--;
                    nextKY++;
                } else if (command.equals("RB")) {
                    nextKX++;
                    nextKY--;
                } else if (command.equals("LB")) {
                    nextKX--;
                    nextKY--;
                }

                if (nextKX < 0 || nextKX > 7 || nextKY < 0 || nextKY > 7) {
                    continue;
                }

                if (nextKX == stoneX && nextKY == stoneY) {
                    nextSX = stoneX;
                    nextSY = stoneY;

                    if (command.equals("R")) {
                        nextSX++;
                    } else if (command.equals("L")) {
                        nextSX--;
                    } else if (command.equals("B")) {
                        nextSY--;
                    } else if (command.equals("T")) {
                        nextSY++;
                    } else if (command.equals("RT")) {
                        nextSX++;
                        nextSY++;
                    } else if (command.equals("LT")) {
                        nextSX--;
                        nextSY++;
                    } else if (command.equals("RB")) {
                        nextSX++;
                        nextSY--;
                    } else if (command.equals("LB")) {
                        nextSX--;
                        nextSY--;
                    }

                    if (nextSX < 0 || nextSX > 7 || nextSY < 0 || nextSY > 7) {
                        continue;
                    }
                }

                kingX = nextKX;
                kingY = nextKY;

                stoneX = nextSX;
                stoneY = nextSY;
            }

            char outKX = (char) (kingX + 'A');
            int outKY = kingY + 1;

            char outSX = (char) (stoneX + 'A');
            int outSY = stoneY + 1;

            System.out.println(outKX + "" + outKY);
            System.out.println(outSX + "" + outSY);
        }
    }
}

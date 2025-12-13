
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {

            int R = sc.nextInt();
            int C = sc.nextInt();
            
            sc.nextLine();

            char[][] map = new char[R][C];
            char[][] newMap = new char[R][C];


            for (int i = 0; i < R; i++) {
                String inputs = sc.nextLine();
                for (int j = 0; j < C; j++) {
                    map[i][j] = inputs.charAt(j);
                    newMap[i][j] = 'X';
                }
            }
            
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    if (map[r][c] == 'X') {
                        int seaCount = 0;
                        
                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];
                            
                            if (nr < 0 || nr >= R || nc < 0 || nc >= C) {
                                seaCount++;
                            }
                            else if (map[nr][nc] == '.') {
                                seaCount++;
                            }
                        }


                        if (seaCount >= 3) {
                            newMap[r][c] = '.';
                        } else {
                            newMap[r][c] = 'X';
                        }
                    } else {
                        newMap[r][c] = '.';
                    }
                }
            }


            int minR = R, maxR = -1;
            int minC = C, maxC = -1;

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (newMap[i][j] == 'X') {
                        minR = Math.min(minR, i);
                        maxR = Math.max(maxR, i);
                        minC = Math.min(minC, j);
                        maxC = Math.max(maxC, j);
                    }
                }
            }
            
            if (maxR != -1) {
                for (int i = minR; i <= maxR; i++) {
                    for (int j = minC; j <= maxC; j++) {
                        System.out.print(newMap[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
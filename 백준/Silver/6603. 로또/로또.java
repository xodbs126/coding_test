import java.util.Scanner;

public class Main {
    static int N;
    static int[] numbers;
    static int[] result = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            N = sc.nextInt();
            if (N == 0) break;

            numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = sc.nextInt();
            }

            dfs(0, 0);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            result[depth] = numbers[i];
            dfs(depth + 1, i + 1);
        }
    }
}
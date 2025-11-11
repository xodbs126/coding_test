import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            String num = Integer.toString(i);
            int repeatCount = 0;

            for (char c : num.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    repeatCount++;
                }
            }

            if (repeatCount > 0) {
                for (int j = 0; j < repeatCount; j++) {
                    sb.append("-");
                }
                sb.append(" ");
            } else {
                sb.append(num).append(" ");
            }
        }

        if (sb.length() > 0) sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
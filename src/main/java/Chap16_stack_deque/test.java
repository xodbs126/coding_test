package Chap16_stack_deque;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            System.out.println(valid(input) ? "YES" : "NO");
        }
    }

    private static boolean valid(String input) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')') {
                if (stk.isEmpty()) {
                    return false;
                }
                stk.pop();
            }
        }

        return stk.isEmpty();
    }
}

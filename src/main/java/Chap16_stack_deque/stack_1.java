package Chap16_stack_deque;

import java.util.Scanner;
import java.util.Stack;

public class stack_1 {
    static Stack<Integer> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String cmd = sc.next();
            command(cmd);
        }

    }

    private static void command(String cmd) {
        if (cmd.equals("push")) {
            stack.push(sc.nextInt());
        } else if (cmd.equals("top")) {
            if (!stack.isEmpty()) {
                System.out.println(stack.peek());
            } else {
                System.out.println(-1);
            }
        } else if (cmd.equals("size")) {
            System.out.println(stack.size());
        } else if (cmd.equals("empty")) {
            if (stack.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (cmd.equals("pop")) {
            if (!stack.isEmpty()) {
                System.out.println(stack.pop());
            } else {
                System.out.println(-1);
            }
        }
    }
}
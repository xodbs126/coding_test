package Chap16_stack_deque;

import java.io.*;
import java.util.Stack;

public class zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int command = Integer.parseInt(br.readLine());

            if (command == 0 && !stack.isEmpty()) {
                stack.pop();
            } else if (command != 0) {
                stack.push(command);
            }
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}

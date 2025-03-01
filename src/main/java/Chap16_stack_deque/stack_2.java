package Chap16_stack_deque;

import java.io.*;
import java.util.Stack;

public class stack_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);
            if (command == 1)stack.push(Integer.parseInt(input[1]));
            else if (command == 2) {
                if (stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.pop() + "\n");
            }else if (command == 3) bw.write(stack.size() + "\n");
             else if (command == 4) {
                if (stack.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }else if (command == 5) {
                if (stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

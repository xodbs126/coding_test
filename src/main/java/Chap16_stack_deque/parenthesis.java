package Chap16_stack_deque;

import java.io.*;
import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            boolean isValid = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                }else{
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!isValid || !stack.isEmpty()) {
                bw.write("NO\n");
            } else bw.write("YES\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}

package Chap22_greedy;

import java.io.*;

public class lost_parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split("-");
        int result = sum(inputs[0]);

        for (int i = 1; i < inputs.length; i++) {
            result -= sum(inputs[i]);
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int sum(String part) {
        String[] numbers = part.split("\\+");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}



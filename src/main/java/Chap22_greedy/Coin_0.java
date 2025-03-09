package Chap22_greedy;

import java.io.*;

public class Coin_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int money = Integer.parseInt(input[1]);
        int changes = 0;
        int[] coins = new int[count];

        for (int i = 0; i < count; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = count - 1; i >= 0; i--) {
            if (money >= coins[i]) {
                changes += money / coins[i];
                money %= coins[i];
            }
        }

        bw.write(changes+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

package Chap14_set_Map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class num_Card_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(cards[i]);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] target = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(target[i]);
            if (map.containsKey(num)) {
                bw.write(map.get(num) + " ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

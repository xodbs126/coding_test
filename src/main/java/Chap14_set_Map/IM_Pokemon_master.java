package Chap14_set_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IM_Pokemon_master {
    public static void main(String[] args) {
        Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer, String> numToName = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sb.append(numToName.get(num)).append("\n");
            } else {
                String name = sc.next();
                sb.append(nameToNum.get(name)).append("\n");
            }
        }

        System.out.print(sb);
    }
}

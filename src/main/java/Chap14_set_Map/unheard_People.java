package Chap14_set_Map;

import java.io.*;
import java.util.*;

public class unheard_People {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int f_count = Integer.parseInt(input[0]);
        int s_count = Integer.parseInt(input[1]);

        Set<String> f_list = new HashSet<>();
        List<String> intersection = new ArrayList<>();

        for (int i = 0; i < f_count; i++) {
            f_list.add(br.readLine().trim());
        }

        for (int i = 0; i < s_count; i++) {
            String name = br.readLine().trim();
            if (f_list.contains(name)) {
                intersection.add(name);
            }
        }

        Collections.sort(intersection);
        bw.write(intersection.size() + "\n");
        for (String s : intersection) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

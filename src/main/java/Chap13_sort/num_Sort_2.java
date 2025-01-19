package Chap13_sort;

import java.io.*;
import java.util.*;

public class num_Sort_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int num : list) {
            bw.write(num + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

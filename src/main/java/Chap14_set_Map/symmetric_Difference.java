package Chap14_set_Map;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class symmetric_Difference {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A_count = Integer.parseInt(input[0]);
        int B_count = Integer.parseInt(input[1]);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        String[] inputA = br.readLine().split(" ");
        for (int i = 0; i < A_count; i++) {
            A.add(Integer.parseInt(inputA[i]));
        }

        String[] inputB = br.readLine().split(" ");
        for (int i = 0; i < B_count; i++) {
            B.add(Integer.parseInt(inputB[i]));
        }

        Set<Integer> difference_A = new HashSet<>(A);
        difference_A.removeAll(B);

        Set<Integer> difference_B = new HashSet<>(B);
        difference_B.removeAll(A);

        bw.write((difference_A.size()+difference_B.size())+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

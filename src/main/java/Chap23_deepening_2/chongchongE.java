package Chap23_deepening_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class chongchongE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String first = sc.next();
            String second = sc.next();

            if (set.contains(first) || set.contains(second)) {
                set.add(first);
                set.add(second);
            }
        }

        System.out.println(set.size());

    }
}

package Chap23_deepening_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class gomgomE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count =0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            if (input.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(input)) {
                    set.add(input);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

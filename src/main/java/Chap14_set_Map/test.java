package Chap14_set_Map;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }


        Set<Integer> difference_A = new HashSet<>(set2);
        difference_A.removeAll(set1);

        Set<Integer> difference_B = new HashSet<>(set1);
        difference_B.removeAll(set2);

        System.out.println(difference_A.size()+difference_B.size());



    }
}

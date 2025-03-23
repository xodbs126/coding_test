package Chap14_set_Map;

import java.io.*;
import java.util.*;

public class people_In_Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String cmd = sc.next();
            if (cmd.equals("enter")) {
                set.add(name);
            } else set.remove(name);
        }
        for (String s : set) {
            System.out.println(s);
        }


        sc.close();
    }
}

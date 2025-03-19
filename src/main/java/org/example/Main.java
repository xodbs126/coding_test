package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        Set<String> nofamous = new HashSet<String>();
        String[] listen = new String[n];
        String[] watch = new String[m];

        for (int i = 0; i < n; i++) {
            listen[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            watch[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (listen[i].equals(watch[j])) {
                    count++;
                    nofamous.add(listen[i]);
                    break;
                }
            }
        }

        count = n - nofamous.size();
        System.out.println(count);
        for (String s : nofamous) {
            System.out.println(s);
        }
    }
}

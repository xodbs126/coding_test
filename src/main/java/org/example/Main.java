package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] string = new String[n];
        for (int i = 0; i < n; i++) string[i] = sc.next();

        Arrays.sort(string);


    }

}

package org.example;

import java.util.*;

public class Main {
    static int count = 0;
    static HashSet<Integer> uniqueNumbers = new HashSet<>();

    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array,commands));


    }

    private static List<Integer> solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(array);
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[j - (commands[i][0] - 1)] = array[j];
            }

            list.add(temp[commands[i][2]-1]);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }


        return list;
    }


}

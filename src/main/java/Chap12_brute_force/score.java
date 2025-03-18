package Chap12_brute_force;

import java.util.ArrayList;
import java.util.List;

public class score {
    public static void main(String[] args) {
        {
            //[1,3,2,4,2]
            int[] answers = new int[]{1,3,2,4,2};
            int[] pattern1 = {1, 2, 3, 4, 5};
            int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int max = Integer.MIN_VALUE;
            int[] score = new int[3];


            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == pattern1[i % pattern1.length]) score[0]++;
                if (answers[i] == pattern2[i % pattern2.length]) score[1]++;
                if (answers[i] == pattern3[i % pattern3.length]) score[2]++;
            }

            for (int i = 0; i < 3; i++) {
                if (max < score[i]) {
                    max = score[i];
                }
            }

            for (int i = 0; i < 3; i++) {
                if (max == score[i]) {
                    list.add(i+1);
                }
            }

        }
    }
}

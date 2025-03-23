package Chap13_sort;

import java.util.*;

public class tet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i]=nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);


    }
}

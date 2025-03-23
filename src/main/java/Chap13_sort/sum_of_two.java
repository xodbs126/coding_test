package Chap13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (target == sum) {
                left++;
                right--;
                count++;
            }
            else if(target > sum) left++;
            else right--;

        }
        System.out.println(count);

    }
}

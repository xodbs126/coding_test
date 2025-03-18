package Chap12_brute_force;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static HashSet<Integer> uniqueNumbers = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int[] nums = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            nums[i] = string.charAt(i) - '0';
        }
        func(nums, new boolean[nums.length], "");

        System.out.println(count);
    }

    private static void func(int[] nums, boolean[] used, String current) {
        if (!current.isEmpty()) {
            int number = Integer.parseInt(current);
            if (uniqueNumbers.add(number) && isPrime(number)) {
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                func(nums, used, current + nums[i]);
                used[i] = false;
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

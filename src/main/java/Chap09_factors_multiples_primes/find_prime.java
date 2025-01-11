package Chap09_factors_multiples_primes;
/***
 * 문제
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *
 * 출력
 * 주어진 수들 중 소수의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class find_prime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int count = 0;

        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(nums[i]);

            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

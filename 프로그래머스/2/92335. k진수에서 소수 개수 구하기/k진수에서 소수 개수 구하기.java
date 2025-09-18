import java.util.*;

class Solution {
    public int solution(int n, int k) {

        String nTok = Integer.toString(n, k);
        String[] replace = nTok.replace('0', ',').split(",");
        int result = 0;

        for (int i = 0; i < replace.length; i++) {
            if (!replace[i].isEmpty()) {


                long target = Long.parseLong(replace[i]);

                if (isPrime(target)) {
                    result++;
                }
            }

        }

        return result;

    }

    private boolean isPrime(long target) {
        if (target < 2) return false;
        for (long i = 2; i * i <= target; i++) {
            if (target % i == 0) return false;
        }
        return true;
    }
}

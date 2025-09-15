import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder allNum = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; allNum.length() <= t * m; i++){
            allNum.append(Integer.toString(i, n).toUpperCase());
        }

        for(int i = p - 1;  result.length() < t; i += m){
            result.append(allNum.charAt(i));
        }

        return result.toString();
    }
}
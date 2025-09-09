import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize==0) return cities.length*5;
        List<String> list = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String targetCity = cities[i].toUpperCase();
            if (!list.contains(targetCity)) {
                answer += 5;
                if (list.size() >= cacheSize) {
                    list.remove(0);
                }
                list.add(targetCity);
                continue;
            }

            if (list.contains(targetCity)) {
                list.remove(targetCity);
                list.add(targetCity);
                answer += 1;
            }
        }
        return answer;
    }
}
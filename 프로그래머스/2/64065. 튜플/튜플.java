import java.util.*;

class Solution {
    public int[] solution(String s){
        Map<Integer, Integer> map = new HashMap<>();

        String[] nums = s.replaceAll("[{}]", " ").replaceAll(",", " ").trim().split("\\s+");

        for (String numStr : nums) {
            if (!numStr.isEmpty()) {
                int num = Integer.parseInt(numStr);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int[] answer = new int[keyList.size()];
        for (int i = 0; i < keyList.size(); i++) {
            answer[i] = keyList.get(i);
        }

        return answer;
    }
}

package Chap23_deepening_2;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
        }
        Collections.sort(list);

        int avg = (int) Math.round((double) sum / N);

        int median = list.get(N / 2);

        int[] count = new int[8001];
        for (int num : list) {
            count[num + 4000]++;
        }

        int maxFreq = 0;
        for (int c : count) {
            if (c > maxFreq) maxFreq = c;
        }

        List<Integer> modeCandidates = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxFreq) {
                modeCandidates.add(i - 4000);
            }
        }

        int mode;
        if (modeCandidates.size() > 1) {
            Collections.sort(modeCandidates);
            mode = modeCandidates.get(1);
        } else {
            mode = modeCandidates.get(0);
        }

        int range = list.get(N - 1) - list.get(0);

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}

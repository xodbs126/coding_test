package Chap13_sort;

/***
 * 문제
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 *
 * Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
 *
 * X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 *
 * 입력
 * 첫째 줄에 N이 주어진다.
 *
 * 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
 *
 * 출력
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class points_compress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> set = new TreeSet<>(list);

        List<Integer> sortedList = new ArrayList<>(set);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sortedList.size(); i++) {
            map.put(sortedList.get(i), i);
        }

        StringBuilder sb = new StringBuilder();

        for (int num : list) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
    }
}

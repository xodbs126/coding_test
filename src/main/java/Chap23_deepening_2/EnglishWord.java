package Chap23_deepening_2;

import java.io.*;
import java.util.*;

public class EnglishWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordlist = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.length() < M)
                continue;
            wordlist.put(input, wordlist.getOrDefault(input, 0) + 1);
        }

        List<String> words = new ArrayList<>(wordlist.keySet());

        words.sort((a, b) -> {
            int freqA = wordlist.get(a);
            int freqB = wordlist.get(b);
            if (freqA != freqB)
                return freqB - freqA;
            if (a.length() != b.length())
                return b.length() - a.length();

            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

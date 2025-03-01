package Chap14_set_Map;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class different_Words_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();

        Set<String> words = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                words.add(s.substring(i, j));
            }
        }
        bw.write(words.size() + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

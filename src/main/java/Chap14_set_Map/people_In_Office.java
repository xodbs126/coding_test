package Chap14_set_Map;

import java.io.*;
import java.util.*;

public class people_In_Office {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        Map<String, String> log = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            if (input[1].equals("leave")) {
                log.remove(input[0]);
            } else {
                log.put(input[0], input[1]);
            }
        }

        List<String> peopleInOffice = new ArrayList<>(log.keySet());
        Collections.sort(peopleInOffice, Collections.reverseOrder());

        for (String name : peopleInOffice) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

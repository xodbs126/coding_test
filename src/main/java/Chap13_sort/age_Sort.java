package Chap13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class age_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Age[] people = new Age[N];
        for (int i = 0; i < N; i++) {

            String[] input = br.readLine().split(" ");
            people[i] = new Age(Integer.parseInt(input[0]), input[1]);
        }

        Arrays.sort(people,(a,b)->{
            return Integer.compare(a.getAge(), b.getAge());
        });

        for (Age person : people) {
            System.out.println(person.getAge()+" "+person.getName());
        }

    }

}

class Age {
    private String name;
    private int age;

    public Age(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

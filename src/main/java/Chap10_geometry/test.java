package Chap10_geometry;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nemo = new int[3][2];

        int x,y;
        for (int i = 0; i < 3; i++) {
            nemo[i][0] = sc.nextInt();
            nemo[i][1] = sc.nextInt();
        }

        if (nemo[0][0] == nemo[1][0]) {
            x = nemo[2][0];
        } else if(nemo[0][0] == nemo[2][0]) x = nemo[1][0];
        else x = nemo[0][0];

        System.out.println(x);
    }
}

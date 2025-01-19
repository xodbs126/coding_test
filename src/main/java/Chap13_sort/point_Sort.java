package Chap13_sort;

import java.io.*;
import java.util.Arrays;

public class point_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        point[] points = new point[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            point point = new point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            points[i] = point;
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1.x == p2.x) {
                return Integer.compare(p1.y, p2.y);
            }
            return Integer.compare(p1.x, p2.x);
        });

        for (point point : points) {
            System.out.println(point.getX()+" "+point.getY());
        }

    }
}

class point {
    int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

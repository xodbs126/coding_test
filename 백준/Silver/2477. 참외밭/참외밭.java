
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        int[] lengths = new int[6];
        int maxWidth = 0, maxWidthIdx = 0;
        int maxHeight = 0, maxHeightIdx = 0;

        for (int i = 0; i < 6; i++) {
            int command = sc.nextInt();
            int len = sc.nextInt();
            lengths[i] = len;

            if (command == 1 || command == 2) {
                if (len > maxWidth) {
                    maxWidth = len;
                    maxWidthIdx = i;
                }
            }
            else {
                if (len > maxHeight) {
                    maxHeight = len;
                    maxHeightIdx = i;
                }
            }
        }

        int bigArea = maxWidth * maxHeight;

        int smallWidth = lengths[(maxWidthIdx + 3) % 6];
        int smallHeight = lengths[(maxHeightIdx + 3) % 6];

        int smallArea = smallWidth * smallHeight;

        System.out.println((bigArea - smallArea) * K);
    }
}
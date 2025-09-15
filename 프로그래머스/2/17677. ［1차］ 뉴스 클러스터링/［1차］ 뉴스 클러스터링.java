import java.util.*;
class Solution {
    public static int solution(String str1, String str2) {

        List<String> str1List =new ArrayList<>();
        String str1UpperCase = str1.toUpperCase();

        for (int i = 0; i < str1UpperCase.length()-1; i++) {
            char a = str1UpperCase.charAt(i);
            char b = str1UpperCase.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                str1List.add("" + a + b);
            }
        }

        List<String> str2List =new ArrayList<>();
        String str2UpperCase = str2.toUpperCase();
        for (int i = 0; i < str2UpperCase.length() - 1; i++) {
            char a = str2UpperCase.charAt(i);
            char b = str2UpperCase.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                str2List.add("" + a + b);
            }
        }

        List<String> intersectionList = new ArrayList<>(str2List);
        int size = 0;
        for (String s : str1List) {
            if (intersectionList.remove(s)) {
                size++;
            }
        }


        int unionSize = str1List.size() + str2List.size() - size;
        
        if (unionSize == 0) {
            return 65536;
        }
        
        double result = (double) size / unionSize;

        return (int) (result * 65536);



    }
}
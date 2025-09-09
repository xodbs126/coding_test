class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int bitResult = arr1[i] | arr2[i];
            
            String binaryResult = Integer.toBinaryString(bitResult);
            String fitBinaryResult = String.format("%" + n + "s", binaryResult).replace(' ', '0');
            String finalResult = fitBinaryResult.replace('1', '#').replace('0', ' ');
            result[i] = finalResult;
        }

        return result;
    }
}
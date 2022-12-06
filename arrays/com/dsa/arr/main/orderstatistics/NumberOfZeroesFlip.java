package com.dsa.arr.main.orderstatistics;

public class NumberOfZeroesFlip {
    public static void findZeroFlip(int[] arr, int m) {
        int zeroCount = 0, countOfOnes = 0, length = arr.length;
        int[] leftOnes = new int[length];
        int[] rightOnes = new int[length];
        int [] zeroIndexes = new int [length];
        for(int i = 0 ; i < length ; i ++) {
            if(arr[i] == 0){
                leftOnes[i] = countOfOnes;
                zeroIndexes[zeroCount++] = i;
                countOfOnes = 0;
            }else {
                countOfOnes++;
                leftOnes[i] = -1;
            }
        }
        countOfOnes = 0;
        for(int i = length -1 ; i >= 0 ; i--) {
            if(arr[i] == 0){
                rightOnes[i] = countOfOnes;
                countOfOnes = 0;
            }else {
                countOfOnes++;
                rightOnes[i] = -1;
            }
        }
        int start = 0 , end = 0 , len = 0  , maxLen = Integer.MIN_VALUE , startIndex = -1 , lastIndex = -1;
        while(end < length){
            if(end-start == m){
                if(len > maxLen){
                    maxLen = len;
                    startIndex = start;
                    lastIndex = end;
                }
                len -= leftOnes[zeroIndexes[start]] + rightOnes[zeroIndexes[start]] ;
                start++;
            }
            len += leftOnes[zeroIndexes[end]] + rightOnes[zeroIndexes[end]] ;
            end++;
        }
        System.out.println("The indexes that need to be changed is "+startIndex + "   "+lastIndex);
}

    public static void test() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        findZeroFlip(arr, 2);
    }
}

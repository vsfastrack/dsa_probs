package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;
import java.util.Arrays;

public class NumberWithOddOccurences {
    public int [] findElementsWithOddOccurence(int [] arr){
        int length = arr.length;
        Arrays.sort(arr);
        int start = 0 ;
        int end = 0 , count = 0;
        int [] result = new int [2];
        while(end < length){
            while(end < length && arr[end] == arr[start]){
                end++;
            }
            if((end - start)%2 != 0){
                result[count++] = arr[start];
            }
            if(result[0] != 0 && result[1] != 0)
                return result;
            start = end;
        }
        return null;
    }
    public static void test(){
        int [] arr = {12,23,34,12,12,23,12,45};
        ArrayUtils.printArr(new NumberWithOddOccurences()
                .findElementsWithOddOccurence(arr));
    }
}

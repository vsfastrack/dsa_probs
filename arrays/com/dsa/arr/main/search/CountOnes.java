package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class CountOnes {
    public int countNumberOfOccurences(int [] arr , int key){
        int length = arr.length;
        if(length < 1)
            return 0;
        int firstOccurence = ArrayUtils.findFirstOccurence(arr , 0 , length-1 , key);
        int lastOccurence = ArrayUtils.findLastOccurence(arr , 0 , length-1 , key);
        if(firstOccurence == -1 || lastOccurence == -1)
            return -1;
        return lastOccurence - firstOccurence + 1;
    }
    public static void test(){
        int [] arr = {1,1,1,2,2,2,2};
        ArrayUtils.printSingleResult(new CountOnes().countNumberOfOccurences(arr , 1));
    }
}

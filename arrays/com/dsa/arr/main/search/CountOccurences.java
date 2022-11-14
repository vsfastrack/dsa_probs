package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class CountOccurences {
    public int countOccurences(int [] arr , int X){
        int length = arr.length;
        if(length == 0)
            return -1;
        int firstOccurence = ArrayUtils.findFirstOccurence(arr , 0 ,length-1,X);
        int lastOccurence = ArrayUtils.findLastOccurence(arr , 0 , length-1,X);
        if(firstOccurence != -1 || lastOccurence != -1)
            return (lastOccurence - firstOccurence) + 1;
        return -1;
    }
    public static void test(){
        int [] arr = {1,1,2,2,2,2,3};
        ArrayUtils.printSingleResult(new CountOccurences().countOccurences(arr , 4));
    }
}

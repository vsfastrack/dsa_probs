package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class SearchInfinite {
    public int searchInfinite(int [] arr , int X){
        int high = 1;
        int low = 0;
        while(arr[high] < X){
            low = high;
            high *= 2;
        }
        return ArrayUtils.binarySearch(arr , X ,low , high );
    }
    public static void test(){
        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        ArrayUtils.printSingleResult(new SearchInfinite().searchInfinite(arr , 10));
    }
}

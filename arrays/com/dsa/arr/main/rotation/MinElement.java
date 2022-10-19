package com.dsa.arr.main.rotation;

import com.dsa.arr.main.util.ArrayUtils;

public class MinElement {

    private static int findMinElementInSortedAndRotatedArr(int [] arr){
        int length = arr.length;
        if(length == 0)
            return -1;
        int pivot = ArrayUtils.findPivotUsingBinarySearch(arr , 0 , length-1);
        if(pivot == -1)
            return pivot;
        return arr[pivot+1];
    }

    public static void test(){
        int [] arr = {3,4,5,1,2};
        ArrayUtils.printSingleResult(findMinElementInSortedAndRotatedArr(arr));
    }
}

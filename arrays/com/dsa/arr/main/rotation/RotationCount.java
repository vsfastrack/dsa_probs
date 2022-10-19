package com.dsa.arr.main.rotation;

import com.dsa.arr.main.util.ArrayUtils;

//Program to find rotationCount
public class RotationCount {

    /**
     * Find rotation count by finding pivot index using modified binarySearch
     * @param arr
     * @return
     */
    public static int findRotationCount(int [] arr){
        int length = arr.length;
        if(length < 2)
            return -1;
        int pivotIndex = ArrayUtils.findPivotUsingBinarySearch(arr , 0 ,length-1);
        if(pivotIndex == -1)
            return pivotIndex;
        return (length- 1 - pivotIndex);
    }
    public static void test(){
        int [] arr = {3,4,5,1,2};
        ArrayUtils.printSingleResult(findRotationCount(arr));
    }
}

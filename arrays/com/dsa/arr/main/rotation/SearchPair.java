package com.dsa.arr.main.rotation;

import com.dsa.arr.main.util.ArrayUtils;

public class SearchPair {

    private static int[] searchPair(int [] arr , int target){
        int pivotIndex = RotationCount.findRotationCount(arr);
        if(pivotIndex == -1)
            return new int[]{-1,-1};
        int length = arr.length;
        int start = pivotIndex + length, end = pivotIndex+1+length;
        while(start < end){
            int firstPointer = start % length;
            int secondPointer = end % length;
            if(arr[firstPointer] + arr[secondPointer] == target)
                return new int[]{arr[firstPointer] , arr[secondPointer]};
            if(arr[firstPointer] + arr[secondPointer] < target)
                end++;
            else
                start--;
        }
        return new int[]{-1,-1};
    }
    public static void test(){
        int [] arr = {3,4,5,1,2};
        ArrayUtils.printArr(searchPair(arr , 7));
    }
}

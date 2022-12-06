package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class MoveAllNegToEnd {
    public void moveNegElementsToEnd(int [] arr){
        int length = arr.length;
        int index = 0  , negCount = 0  , currIndex = 0;
        while(index < length){
            if(arr[index++] < 0)
                negCount++;
        }
        int [] negatives = new int[negCount];
        index = 0 ; negCount = 0;
        while(index < length){
            if(arr[index] >= 0)
                arr[currIndex++] = arr[index++];
            else
                negatives[negCount++] = arr[index++];
        }
        index = 0 ; negCount = 0;
        while(currIndex < length){
            arr[currIndex++] = negatives[negCount++];
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {1,-1,3,2,-7,-5,11,6};
        new MoveAllNegToEnd().moveNegElementsToEnd(arr);
    }
}

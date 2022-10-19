package com.dsa.arr.main.rotation;

import com.dsa.arr.main.util.ArrayUtils;

public class RotatedSearch {

    public static int search(int [] arr , int key){
        int length = arr.length;
        int pivot = ArrayUtils.findPivotUsingBinarySearch(arr , 0 , length-1);
        System.out.println(pivot);
        if(pivot == -1)
            return pivot;
        if(arr[0] <= key && key <= arr[pivot])
            return ArrayUtils.binarySearch(arr , key , 0 , pivot);
        else if(key >= arr[pivot+1] && key <= arr[length -1])
            return ArrayUtils.binarySearch(arr , key,pivot+1 , length-1);
        else
            return -1;
    }
    public static void test(){
        int [] arr = {4,5,1,2,3};
        int key = 2;
        ArrayUtils.printSingleResult(search(arr , key));
    }
}

package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class MergeArrays {
    public void mergeSortedArr(int [] arr1 , int [] arr2 , int m , int n){
        int length = arr1.length ;
        if(length != m+n)
            return;
        int start = length-1 , count = length -1 ;
        while(start >= 0){
            if(arr1[start] != -1)
                arr1[count--] = arr1[start];
            start--;
        }
        start = 0;
        while(start < n){
            arr1[start++] = -1;
        }
        int firstPtr = n , secondPtr = 0 , zeroPtr = 0;
        while(firstPtr < (n + m) && secondPtr < n){
            if(arr1[firstPtr] < arr2[secondPtr])
                arr1[zeroPtr++] = arr1[firstPtr++];
            else if(arr2[secondPtr] < arr1[firstPtr])
                arr1[zeroPtr++] = arr2[secondPtr++];
            else{
                arr1[zeroPtr++] = arr1[firstPtr++];
                arr1[zeroPtr++] = arr2[secondPtr++];
            }
        }
        while(firstPtr < n + m)
            arr1[zeroPtr++] = arr1[firstPtr++];
        while(secondPtr < n)
            arr1[zeroPtr++] = arr2[secondPtr++];
    }
    public static void test(){
        int [] arr1 = {2,8,-1,-1,-1,13,-1,15,20};
        int [] arr2 = {5,7,9,25};
        int m = 5;
        int n = 4;
        new MergeArrays().mergeSortedArr(arr1 , arr2 , m ,n);
        ArrayUtils.printArr(arr1);
    }
}

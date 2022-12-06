package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class ClosestPair {
    public int [] findClosestPair(int [] arr , int X){
        int start = 0 , end = arr.length -1 ,  min = Integer.MAX_VALUE ;
        int [] result = new int[2];
        while(start < end){
            int pairSum = arr[start] + arr[end] ;
            if(Math.abs(X - pairSum) < min){
                min = X  - (arr[start] + arr[end]);
                result[0] = arr[start];
                result[1] = arr[end];
            }
            if(X - pairSum > 0)
                start++;
            else if(X - pairSum < 0)
                end--;
        }
        return result;
    }
    public static void test(){
        int [] arr = {10,22,28,29,30,40};
        int X = 54;
        ArrayUtils.printArr(new ClosestPair().findClosestPair(arr,X));
    }
}

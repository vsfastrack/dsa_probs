package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class SubArrayWithGivenSum {
    public int [] findSubArrayWithGivenSum(int [] arr , int K){
        int currentSum = 0 , start = 0 ,end = 0  , length = arr.length;
        while(end < length){
            if(currentSum + arr[end] == K)
                return new int []{start , end};
            else if(currentSum + arr[end] < K){
                currentSum += arr[end];
                end++;
            }else{
                currentSum -= arr[start];
                start++;
            }
        }
        return null;
    }
    public static void test(){
        int [] arr = {1,4,20,3,10,5};
        int K = 33;
        ArrayUtils.printArr(new SubArrayWithGivenSum()
                .findSubArrayWithGivenSum(arr , K));
    }
}

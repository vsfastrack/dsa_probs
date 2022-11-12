package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class GivenSumTriplet {
    public int [] findGivenSumTriplet(int [] arr , int X){
        int length = arr.length;
        if(length < 3)
            return null;
        Arrays.sort(arr);
        for(int i = 0 ; i < length-2  ; i++){
            int element = arr[i];
            int target = X - element;
            int start = i + 1 , end = length -1;
            while(start < end){
                if(arr[start] + arr [end] == target){
                    return new int[]{arr[i] , arr[start] , arr[end]};
                }
                else if(arr[start] + arr[end] < X)
                    start++;
                else
                    end--;
            }
        }
        return null;
    }
    public static void test(){
        int [] arr = {12,3,4,1,6,9};
        int X = 24;
        ArrayUtils.printArr(new GivenSumTriplet().findGivenSumTriplet(arr , X));
    }
}

package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class ConstructAnArrayFromPairSum {
    public int [] constructArrayFromPairSum(int [] arr , int n){
        int length = arr.length , z= 0;
        int firstElement = ((arr[0] - arr[n-1]) + (arr[1]))/2;
        int [] result = new int[n];
        result[0] = firstElement;
        for(int index = 1 ; index < n; index++){
            result[index] = arr[index-1] - firstElement ;
        }
        return result;
    }
    public static void test(){
        int [] sumPairArr = {14,9,10,11,12,7};
        int n = 4;
        ArrayUtils.printArr(new ConstructAnArrayFromPairSum().constructArrayFromPairSum(sumPairArr , n));
    }
}

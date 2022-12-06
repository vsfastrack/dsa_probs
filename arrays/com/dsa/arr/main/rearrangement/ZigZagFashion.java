package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class ZigZagFashion {
    public static void rearrangeInZigZag(int [] arr){
        int length = arr.length;
        if(length < 3)
            return;
        int start = 0;
        while(start < length - 2){
            int min = Math.min(arr[start] , Math.min(arr[start+1] , arr[start+2]));
            int max = Math.max(arr[start] , Math.max(arr[start+1] , arr[start+2]));
            int sum = arr[start] + arr[start+1] + arr[start+2];
            arr[start+2] = sum - (max+min);
            arr[start+1] = max;
            arr[start] = min;
            start += 2;
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {4,3,7,8,6,2,1};
        rearrangeInZigZag(arr);
    }
}

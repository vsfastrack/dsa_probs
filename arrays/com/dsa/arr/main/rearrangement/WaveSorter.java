package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class WaveSorter {
    public static void sortInWaveForm(int [] arr){
        int length = arr.length;
        if(length < 3)
            return;
        int start = 0;
        while(start < length -2){
            int sum = arr[start] + arr[start+1] + arr[start+2];
            int min = Math.min(arr[start] , Math.min(arr[start+1] , arr[start+2]));
            int max = Math.max(arr[start] , Math.max(arr[start+1] , arr[start+2]));
            int mid = sum - (max + min);
            arr[start] = max;
            arr[start+1] = min;
            arr[start+2] = mid;
            start += 2;
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr ={10,5,6,3,2,20,100,80};
        sortInWaveForm(arr);
    }
}

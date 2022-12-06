package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class SeggregateEvenAndOdds {
    public static void seggregateEvensAndOdds(int [] arr){
        int length = arr.length;
        int start = 0 , end = length -1;
        while(start < end){
            if(arr[start] % 2 != 0 && arr[end] % 2 == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if(arr[start] % 2 == 0)
                start++;
            if(arr[end] % 2 != 0)
                end--;
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {12,34,45,9,8,90,3};
        seggregateEvensAndOdds(arr);
    }
}

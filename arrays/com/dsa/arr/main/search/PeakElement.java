package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;
public class PeakElement {
    public int findPeakElement(int [] arr){
        int length = arr.length;
        if(length < 2)
            return -1;
        if(arr[0] > arr[1])
            return arr[0];
        if(arr[length -1] > arr[length -2])
            return arr[length -1];
        int start = 1 , end = 3;
        while (end < length) {
            int midElement = arr[(start+end)/2];
            if(midElement > arr[start] && arr[end] < midElement)
                return midElement;
            else if(arr[start] > midElement && midElement > arr[end]){
                start+= 2;
                end += 2;
            }else{
                start +=1;
                end += 1;
            }
        }
        return -1;
    }
    public static void test(){
        int [] arr = {10,20,15,2,23,90,67};
        ArrayUtils.printSingleResult(new PeakElement().findPeakElement(arr));
    }
}
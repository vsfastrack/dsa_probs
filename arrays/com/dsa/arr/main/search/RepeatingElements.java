package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class RepeatingElements {
    public int[] findRepeatingElements(int [] arr  , int N){
        int length = arr.length;
        int start = 0 , index , newVal , freq , actualVal , count = 0;
        int [] result = new int[2];
        while(start < length){
            int element = arr[start];
            if(element > N){
                index = element / N;
                newVal = arr[index] ;
                if(newVal > N){
                    actualVal = newVal / N;
                    freq = newVal % N;
                    arr[index] = actualVal * N +(freq + 1);
                }else{
                    arr[index] = newVal * N + 1;
                }
            }else{
                newVal = arr[element];
                if(newVal > N){
                    actualVal = newVal / N;
                    freq = newVal % N;
                    arr[newVal] = actualVal * N +(freq + 1);
                }else{
                    arr[element] = newVal * N + 1;
                }
            }
            start++;
        }
        start = 1;
        while(start < length){
            if(arr[start] > N && arr[start] % N == 2)
                result[count++] = start;
            start++;
        }
        return result;
    }
    public static void test(){
        int [] arr = {4,2,4,5,2,3,1};
        ArrayUtils.printArr(new RepeatingElements().findRepeatingElements(arr , 5));
    }
}

package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class RearrangeByProducts {
    public static void rearrangByProductOfPrevAndNext(int [] arr){
        int length = arr.length;
        if(length < 2)
            return;
        int firstProd = arr[0] * arr[1];
        int lastProd = arr[length-2] * arr[length-1];
        int index = 1 , prev = arr[0];
        while(index < length-1){
            int temp = arr[index];
            arr[index] = prev * arr[index + 1] ;
            prev = temp;
            index++;
        }
        arr[0] = firstProd;
        arr[length -1] = lastProd;
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {2,3,4,5,6};
        rearrangByProductOfPrevAndNext(arr);
    }
}

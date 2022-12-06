package com.dsa.arr.main.orderstatistics;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class AtleastKGreaterElements {
    public static int [] findAllElementsHavingKGreaterElements(int [] arr , int K){
        int length = arr.length;
        if(length < K+1)
            return null;
        Arrays.sort(arr);
        int [] result = new int [length - K];
        for(int index = 0 ; index < length - K ; index++){
            result[index] = arr[index];
        }
        return result;
    }
    public static void test(){
        int [] arr= {2,5,8,3,1};
        ArrayUtils.printArr(findAllElementsHavingKGreaterElements(arr , 2));
    }
}

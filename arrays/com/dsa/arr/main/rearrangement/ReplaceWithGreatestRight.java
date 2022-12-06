package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class ReplaceWithGreatestRight {
    public static void replaceWithGreatestRight(int [] arr){
        int length = arr.length , prevGreat = -1 , index = length -1;
        while(index >= 0){
            int temp = arr[index];
            arr[index] = prevGreat;
            prevGreat = Math.max(prevGreat , temp);
            index--;
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {16,17,4,3,5,2};
        replaceWithGreatestRight(arr);
    }
}

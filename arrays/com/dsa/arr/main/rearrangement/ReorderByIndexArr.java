package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class ReorderByIndexArr {
    public static void reorderByIndexArr(int [] arr , int [] indexArr){
        int length = arr.length;
        int index = 0 , max = Integer.MIN_VALUE;
        while(index < length)
            max = Math.max(max, arr[index++]);
        max++;
        index = 0;
        while(index < length){
            int element = arr[index];
            if(index != indexArr[index]){
                int indexElement = indexArr[index];
                arr[indexElement] = max * arr[indexElement] + ((element >  max) ? (element/max) : element);
            }
            index++;
        }
        index = 0;
        while(index < length){
            arr[index] = (arr[index] > max) ? (arr[index] % max) : arr[index];
            index++;
        }
        ArrayUtils.printArr(arr);
    }
    public static void test(){
        int [] arr = {50, 40, 70, 60, 90};
        int [] indexArr = {3,  0,  4,  1,  2};
        reorderByIndexArr(arr , indexArr);
    }
}

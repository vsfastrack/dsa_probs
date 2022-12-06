package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class AbsDiffSorter {
    public int [] sortByAbsoluteDiff(int [] arr , int X){
        int length = arr.length , index = 0;
        int [] result = new int[length];
        Arrays.sort(arr);
        int floorIndex  = ArrayUtils.findFloorIndex(arr ,  0 , length -1 , X);
        int ceilingIndex = ArrayUtils.findCeilingIndex(arr , 0 , length-1 , X);
        floorIndex = Math.max(floorIndex, 0);
        ceilingIndex = ceilingIndex > 0 ? ceilingIndex : length-1;
            while(floorIndex >= 0 && ceilingIndex < length){
                if(Math.abs(X - arr[floorIndex]) <= Math.abs(X - arr[ceilingIndex])){
                    result[index++] = arr[floorIndex--];
                }else{
                    result[index++] = arr[ceilingIndex++];
                }
            }
            while(floorIndex >= 0)
                result[index++] = arr[floorIndex--];
            while(ceilingIndex < length)
                result[index++] = arr[ceilingIndex++];
        return result;
    }
    public static void test(){
        int [] arr = {10,5,3,9,2};
        int X = 2;
        ArrayUtils.printArr(new AbsDiffSorter().sortByAbsoluteDiff(arr , X));
    }
}

package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class AlternativeSorting {
    public int[] sortAlternative(int [] arr){
        int length = arr.length;
        Arrays.sort(arr);
        int [] temp = new int[length];
        int start = 0 ,end = length - 1 , index = 0;
        while(start <= end){
            if(index % 2 == 0)
                temp[index++] = arr[end--];
            else
                temp[index++] = arr[start++];
        }
        return temp;
    }
    public static void test(){
        int [] arr = {7,1,2,3,4,5,6};
        ArrayUtils.printArr(new AlternativeSorting().sortAlternative(arr));
    }
}

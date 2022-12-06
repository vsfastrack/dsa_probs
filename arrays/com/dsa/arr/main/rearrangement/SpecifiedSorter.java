package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class SpecifiedSorter {

    public static void specifiedSort(int [] arr , int [] order){
        Map<Integer , Integer> record = new HashMap<>();
        int start = 0 , length = arr.length;
        while(start < length){
            record.merge(arr[start++], 1, Integer::sum);
        }
        start = 0;
        int [] temp = new int[length];
        for (int j : order) {
            int frequency = record.get(j);
            int index = 0;
            while (index < frequency) {
                temp[start++] = j;
                index++;
            }
        }
        record.clear();
        for(int j : order){
            record.put(j ,1);
        }
        for (int j : arr) {
            if (record.get(j) == null)
                temp[start++] = j;
        }
        ArrayUtils.printArr(temp);
    }
    public static void test(){
        int [] arr = {2,1,2,5,7,1,9,3,6,8,8};
        int [] order = {2,1,8,3};
        specifiedSort(arr , order);
    }
}

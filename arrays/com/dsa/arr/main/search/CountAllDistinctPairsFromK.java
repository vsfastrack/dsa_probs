package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class CountAllDistinctPairsFromK {

    public int countDistinctDiffEqualToK(int [] arr , int k){
        Map<Integer , Integer> record = new HashMap<>();
        int count = 0;
        for(int element:arr){
            record.put(element , 1);
        }
        for(int index = 0 ; index < arr.length ; index++){
            if(record.get(arr[index] + k) != null)
                count++;
        }
        return count;
    }
    public static void test(){
        int [] arr = {1,5,3,4,2};
        int k=3;
        ArrayUtils.printSingleResult(new CountAllDistinctPairsFromK().countDistinctDiffEqualToK(arr , k));
    }
}

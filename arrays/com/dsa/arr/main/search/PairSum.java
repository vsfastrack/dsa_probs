package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    public int coundPairsWithGivenSum(int [] arr , int sum){
        int length = arr.length;
        if(length == 0)
            return -1;
        int count = 0 ;
        Map<Integer , Integer> pairRecord =  new HashMap<>();
        for (int j : arr) {
            Integer currentCount = pairRecord.get(j);
            if (currentCount != null) {
                count += currentCount;
                pairRecord.put((sum - j), currentCount + 1);
            } else {
                pairRecord.put((sum - j), 1);
            }
        }
        return count;
    }
    public static void test(){
        int [] arr = {1,1,1,1};
        int sum = 2;
        ArrayUtils.printSingleResult(new PairSum().coundPairsWithGivenSum(arr , sum));
    }
}

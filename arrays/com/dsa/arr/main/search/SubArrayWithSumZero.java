package com.dsa.arr.main.search;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumZero {
    public boolean ifSubArrayExistsWithZeroSum(int [] arr){
        int length = arr.length , index = 0 , prefixSum = 0;
        Map<Integer , Integer> record = new HashMap<>();
        while(index < length){
            prefixSum += arr[index] ;
            Integer prevIndex = record.get(prefixSum);
            if(prevIndex == null){
                record.put(prefixSum , index);
            }else{
                return true;
            }
            index++;
        }
        return false;
    }
    public static void test(){
        int [] arr = {4,2,-3,1,6};
        System.out.println("ifSubarrayWithZeroSum(arr) = "+
                new SubArrayWithSumZero().ifSubArrayExistsWithZeroSum(arr));
    }
}

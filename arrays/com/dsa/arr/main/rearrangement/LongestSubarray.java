package com.dsa.arr.main.rearrangement;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void findLongestSubArrayWithZeroesAndOnes(int [] arr){
        int length = arr.length , index = 0 , prefixSum = 0;
        int maxLength = Integer.MIN_VALUE;
        Map<Integer , Integer> record = new HashMap<>();
        record.put(0,-1);
        int start = 0 , end = -1;
        while(index < length){
            if(arr[index] == 0)
                prefixSum -= 1;
            else
                prefixSum += 1;
            if(record.containsKey(prefixSum)){
                int lastOccuredIndex = record.get(prefixSum);
                if((index - lastOccuredIndex) > maxLength){
                    start = lastOccuredIndex;
                    end = index;
                    maxLength = Math.max(maxLength , (index - lastOccuredIndex));
                }
            }
            record.put(prefixSum , index);
            index++;
        }
        System.out.println("Longest subarray with equal 0's and 1's is between"+start + " and "+end);
    }
    public static void test(){
        int [] arr = {1,0,1,1,1,0,0};
        findLongestSubArrayWithZeroesAndOnes(arr);
    }
}

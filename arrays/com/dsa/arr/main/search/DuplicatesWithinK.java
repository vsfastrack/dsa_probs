package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesWithinK {

    public boolean findDuplicatesWithinK(int [] arr , int k){
        int length = arr.length;
        if(length < k+1)
            return false;
        boolean hasPredicatePassed = false;
        Map<Integer , Integer> record = new HashMap<>();
        int start = 0, end =0;
        while(end < k){
            if(record.get(arr[end]) != null){
                hasPredicatePassed = true;
                break;
            }else{
                record.put(arr[end] , 1);
            }
            end++;
        }
        for(end= k ;  end < length && !hasPredicatePassed ; end++){
            if(record.get(arr[end]) == null){
                record.remove(arr[start]);
                start++;
                record.put(arr[end] , 1);
            }else{
                hasPredicatePassed = true;
            }
        }
        return hasPredicatePassed;
    }
    public static void test(){
        int [] arr = {1,2,3,1,4,5};
        int k = 3;
        ArrayUtils.printSingleResult(new DuplicatesWithinK().findDuplicatesWithinK(arr , k));
    }
}

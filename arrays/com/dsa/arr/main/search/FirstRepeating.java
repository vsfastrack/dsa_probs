package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeating {
    public int firstRepeating(int [] arr){
        Map<Integer , Integer> record = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        int firstRepeatingElement = -1;
        for(int index =  0 ; index < arr.length ; index++){
            Integer indexOfElement = record.get(arr[index]);
            if(indexOfElement != null){
                if(indexOfElement < minIndex){
                    minIndex = indexOfElement;
                    firstRepeatingElement = arr[index];
                }
            }else{
                record.put(arr[index] , index);
            }
        }
        return firstRepeatingElement;
    }
    public static void test(){
        int [] arr = {10,5,3,4,3,5,6};
        ArrayUtils.printSingleResult(new FirstRepeating().firstRepeating(arr));
    }
}

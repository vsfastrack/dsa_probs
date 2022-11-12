package com.dsa.arr.main.search;

import java.util.HashMap;
import java.util.Map;

public class PrintDistinct {
    public void printDistinct(int [] arr){
        int length = arr.length;
        Map<Integer , Integer> record = new HashMap<>();
        for(int element : arr){
            Integer frequencyCount = record.get(element);
            if(frequencyCount == null){
                record.put(element , 1);
                System.out.print(element + "  ");
            }
        }
        System.out.println();
    }
    public static void test(){
        int [] arr = {12,10,9,45,2,10,10,45};
        new PrintDistinct().printDistinct(arr);
    }
}

package com.dsa.arr.main.orderstatistics;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.*;

public class KMostOccuringElements {
    public int[] findKMostOccuringElements(int [] arr , int k){
        int length = arr.length;
        if(length < k )
            return null;
        Map<Integer , Integer> frequencyMap = new HashMap<>();
        int [] result = new int[k];
        for(int element:arr){
            frequencyMap.merge(element , 1 , Integer::sum);
        }
        PriorityQueue<Map.Entry<Integer , Integer>> entryHeap = new PriorityQueue<>(
                Map.Entry.comparingByValue(Comparator.reverseOrder()));
        entryHeap.addAll(frequencyMap.entrySet());
        int index = 0;
        while(index < k){
            result[index++] = Objects.requireNonNull(entryHeap.poll()).getValue();
        }
        return result;
    }
    public static void test(){
        int [] arr = {3,1,4,4,5,2,6,1};
        int K = 2;
        ArrayUtils.printArr(new KMostOccuringElements().findKMostOccuringElements(arr , K));
    }
}

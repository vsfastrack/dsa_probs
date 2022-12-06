package com.dsa.arr.main.orderstatistics;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    public int findKthLargest(int [] arr , int K){
        int length = arr.length;
        if(length < K )
            return -1;
        Queue <Integer> maxHeap = new PriorityQueue<>();
        for(int element:arr){
            maxHeap.add(element);
        }
        for(int i = 0 ; i< K-1 ; i++){
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
    public static void test(){
        int [] arr = {4,10,2,3,9,6,8,7,1,5};
        int K = 7;
        System.out.println(new KthLargest().findKthLargest(arr , K));
    }
}

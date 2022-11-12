package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;

class Pair{
    private final int first;
    private final int second;
    private final int sum;
    Pair(int first , int second , int sum){
        this.first = first;
        this.second = second;
        this.sum = sum;
    }
    public int getSum(){
        return sum;
    }
    public int getFirst(){
        return first;
    }
    public int getSecond(){
        return second;
    }
    @Override
    public boolean equals(Object obj){
        Pair targetPair = (Pair) obj;
        return this.getFirst() == targetPair.getFirst() || this.getFirst() == targetPair.getSecond() ||
                this.getSecond() == targetPair.getFirst()  || this.getSecond() == targetPair.getSecond() ;
    }
}
public class FindFourElementsSum {
    public int[] findSumElement(int [] arr , int X){
        int length = arr.length;
        int noOfSumPairs = (length * (length - 1))/2;
        Pair [] pairSumArr = new Pair [noOfSumPairs];
        int count = 0 ;
        for(int i = 0 ; i < length ; i++){
            for(int j= i+1 ; j < length ; j++){
                pairSumArr[count++] = new Pair(arr[i] , arr[j] , arr[i] + arr[j]);
            }
        }
        Arrays.sort(pairSumArr , Comparator.comparing(Pair::getSum));
        int start = 0 , end = noOfSumPairs -1;
        while(start < end){
            int currentSum = pairSumArr[start].getSum() + pairSumArr[end].getSum();
            if(currentSum == X){
                if(!pairSumArr[start].equals(pairSumArr[end])){
                    return new int[] {pairSumArr[start].getFirst() ,
                            pairSumArr[start].getSecond() ,
                    pairSumArr[end].getFirst() ,
                    pairSumArr[end].getSecond()};
                }
            }
            else if(currentSum < X)
                start++;
            else
                end-- ;
        }
        return null;
    }
    public static void test(){
        int [] arr = {10,2,3,4,5,9,7,8};
        int X = 23;
        ArrayUtils.printArr(new FindFourElementsSum().findSumElement(arr , X));
    }
}

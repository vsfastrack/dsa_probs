package com.dsa.arr.main.util;

public class ArrayUtils {

    public static int findPivotUsingBinarySearch(int [] arr , int low , int high){
        if(low >= high)
            return -1;
        int mid = (low + high)/2 ;
        if(mid > 0 && arr[mid-1] > arr[mid])
            return mid - 1;
        if(mid < high-1 && arr[mid+1] < arr[mid])
            return mid;
        if(arr[mid] < arr[low])
            return findPivotUsingBinarySearch(arr , low , mid-1);
        else
            return findPivotUsingBinarySearch(arr , mid+1 , high);
    }
    public static int binarySearch(int [] arr , int key , int low , int high){
        if(low > high)
            return -1;
        int mid = (low + high)/2 ;
        if(arr[mid] == key)
            return mid;
        if(arr[mid] < key)
            return binarySearch(arr,key , mid+1 , high);
        else
            return binarySearch(arr , key , low , mid-1);
    }
    public static void reverse(int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++ ;
            end--;
        }
    }
    public static void printSingleResult(int element){
        System.out.println("Result = "+element);
    }
    public static void printArr(int [] arr){
        System.out.println("Resultant array = ");
        for(int element:arr){
            System.out.print(element+"  ");
        }
        System.out.println();
    }
}

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
        if(low <= high){
            int mid = (low + high)/2 ;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                return binarySearch(arr,key , mid+1 , high);
            else
                return binarySearch(arr , key , low , mid-1);
        }
        return -1;
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
    public static int findFirstOccurence(int [] arr , int low , int high , int key){
        if(low == high)
            return low;
        if(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] > key)
                return findFirstOccurence(arr , low , mid -1 , key);
            else if(arr[mid] < key)
                return findFirstOccurence(arr , mid+1 , high , key);
            else if(mid > low && arr[mid] == key && arr[mid-1] == key)
                return findFirstOccurence(arr , low , mid-1 , key);
            else if(mid > low && arr[mid] == key && arr[mid-1] != key)
                return mid;
        }
        return -1;
    }
    public static int findLastOccurence(int [] arr , int low , int high , int key){
        if(low == high)
            return low;
        if(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] > key)
                return findLastOccurence(arr , low , mid -1 , key);
            else if(arr[mid] < key)
                return findLastOccurence(arr , mid+1 , high , key);
            else if(mid < high && arr[mid] == key && arr[mid+1] == key)
                return findLastOccurence(arr , mid+1 , high , key);
            else if(mid < high && arr[mid] == key && arr[mid+1] != key)
                return mid;
        }
        return -1;
    }
    public static void printSingleResult(int element){
        System.out.println("Result = "+element);
    }
    public static void printSingleResult(boolean result){
        System.out.println("Result = "+result);
    }
    public static void printArr(int [] arr){
        System.out.println("Resultant array = ");
        if(arr == null)
            return;
        for(int element:arr){
            System.out.print(element+"  ");
        }
        System.out.println();
    }
    public static int findFloorIndex(int[] arr , int low , int high , int X){
        if(low <= high){
            int mid = (low + high)/2;
            if(mid > 0  && arr[mid-1] < X && arr[mid] >= X)
                return mid-1;
            else if(arr[mid] > X || (mid > 0 && arr[mid] == X && arr[mid-1] == X))
                return findFloorIndex(arr , low , mid -1 , X);
            else
                return findFloorIndex(arr , mid+1 , high , X);
        }
        return -1;
    }
    public static int findCeilingIndex(int [] arr , int low , int high , int X){
        if(low <= high){
            int mid = (low + high)/2;
            if(mid < arr.length - 1  && arr[mid] <= X && arr[mid+1] > X)
                return mid+1;
            else if(arr[mid] < X || (mid < arr.length - 1 && arr[mid] == X && arr[mid+1] == X))
                return findCeilingIndex(arr , mid+1 , high , X);
            else
                return findCeilingIndex(arr , low , mid-1 , X);
        }
        return -1;
    }
}

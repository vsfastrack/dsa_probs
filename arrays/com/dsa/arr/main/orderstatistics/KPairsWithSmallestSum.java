package com.dsa.arr.main.orderstatistics;
//TODO
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class Node{
    int value;
    int first;
    int second;
    public Node(int value, int first, int second) {
        this.value = value;
        this.first = first;
        this.second = second;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
}
public class KPairsWithSmallestSum {
    public static void findKPairsWithSmallestSum(int [] arr){
        int length = arr.length;
        int index = 0;
        Queue<Node> minHeap = new PriorityQueue<>(Comparator.comparing(Node::getValue));

    }
}

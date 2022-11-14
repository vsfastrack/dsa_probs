package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

class NodeInfo{
    int frequency;
    int index;
    NodeInfo(int frequency , int index){
        this.frequency = frequency;
        this.index = index;
    }
    public int getFrequency(){
        return this.frequency;
    }
    public void setFrequency(){
        this.frequency = this.frequency + 1;
    }
    public int getIndex(){
        return this.index;
    }
    public int compareTo(NodeInfo nodeInfo){
        if(this.getFrequency() > nodeInfo.getFrequency())
            return 1;
        if(this.getFrequency() == nodeInfo.getFrequency() &&
            this.getIndex() < nodeInfo.getIndex())
            return 1;
        return 0;
    }

}
public class FrequencySort {
    public int [] sortByFrequency(int [] arr){
        int length = arr.length , start = 0;
        int [] result = new int[length];
        Map<Integer , NodeInfo> record = new HashMap<>();
        while(start < length){
            NodeInfo info = record.get(arr[start]);
            if(info == null){
                record.put(arr[start] , new NodeInfo(1,start));
            }else{
                info.setFrequency();
            }
            start++;
        }
        Map<Integer , NodeInfo> sortedRecord = record.entrySet().stream().sorted((e1 , e2)-> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        start = 0;
        for(Map.Entry entry:sortedRecord.entrySet()){
            result[start++] = (int) entry.getKey();
        }
        return result;
    }
    public static void test(){
        int [] arr ={2,5,2,8,5,6,8,8};
        ArrayUtils.printArr(new FrequencySort().sortByFrequency(arr));
    }
}

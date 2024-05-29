// find largest subarray with 0 sum

import java.util.*;

public class LargestSubwith0 {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>map=new HashMap<>();
        //(sum,index)
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           if(map.containsKey(sum)){ // already exist -> calculate length
            len=Math.max(len, i-map.get(sum));
           }
           else{
            map.put(sum, i);
           }
        }
        System.out.println("largest subarray with sum is equal 0 is length is "+ len);
    }
}

// Tree map :- keys are sorted Alphabaticaly

import java.util.*;

public class Hashmap3{
    public static void main(String args[]){
       TreeMap<String,Integer> hm=new TreeMap<>();
        // put 0(1)
        hm.put("India", 500);
        hm.put("Pakistan", 300);
        hm.put("China", 250);
        hm.put("US", 700);
        System.out.println(hm);
    }
}
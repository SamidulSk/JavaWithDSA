// Linked hash map :- keys are oredered as insertion
import java.util.*;

public class LinkedHM{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        // put 0(1)
        hm.put("India", 500);
        hm.put("Pakistan", 300);
        hm.put("China", 250);
        hm.put("US", 700);
        System.out.println(hm);
    }
}
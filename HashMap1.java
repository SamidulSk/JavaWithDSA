// hashing
import java.util.*;
public class HashMap1{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        // put 0(1)
        hm.put("India", 500);
        hm.put("Pakistan", 300);
        hm.put("China", 250);
        hm.put("US", 700);
        System.out.println(hm);

        // Get O(1)
        int code=hm.get("China");
        System.out.println(code);
       // int code2=hm.get("Bangladesh"); ->>> return null
        //System.out.println(code2);

        //containsKey O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indronesia"));

        //remove  O(1)
        System.out.println(hm.remove("Pakistan"));
        System.out.println(hm.remove("Indronesia"));
        System.out.println(hm);

        // // size
        // System.out.println(hm.size());
        
        // // isEmpty
        // System.out.println(hm.isEmpty());
        
        // //clear all
        // hm.clear();
        // System.out.println(hm);
        // System.out.println(hm.isEmpty());

        // Iteration on keySet 
        Set<String> Keys =hm.keySet();
        System.out.println(Keys);

        for (String i : Keys) {    // foreach loop
            System.out.println("Country="+i+", Code="+hm.get(i));
        }

    }
}
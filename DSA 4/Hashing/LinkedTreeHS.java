// Linked Hashset

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedTreeHS{
    public static void main(String args[]){
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("kolkata");
        lhs.add("mumbai");
        lhs.add("surat");
        System.out.println(lhs);  // ordered are mentained 
        System.out.println(lhs.size());

// TreeSet
       TreeSet<String> ts=new TreeSet<>();
       ts.add("Delhi");
       ts.add("Mumbai");
       ts.add("kolkata");
       ts.add("Surat");
       System.out.println(ts);  // sorted according to Alphabeticaly accending

    }
}
// *** HASHSET****

import java.util.HashSet;

public class Hashmap5{
    public static void main(String args[]){
        HashSet<Integer> set =new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(9);
        set.add(2);
        set.add(6);
        set.add(4); // duplicate not allowed
        System.out.println(set);
        System.out.println(set.size());
        set.remove(3);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
import java.util.*;
// Iteration on HashSet

public class HashSetIteration {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Bengaluru");
// 1-> using Iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
   System.out.println("**************");
// 2-> using Enhansed for loop
        for(String city : cities){
            System.out.println(city);
        }        
    }
}

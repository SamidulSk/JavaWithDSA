import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Introducing array list:::>>>> A MODIFIED ARRAY (dynamic array)  --> in-built data structure of java

public class ArrayList1 {
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(9); // TC=O(1) for adding a element in arraylist
    list.add(3);
    list.add(7);
    list.add(8);
    // add at index //O(n)
    list.add(3, 2);
    // printing list
    System.out.println(list);
    // method 2
    // for(int i=0;i<list.size();i++){
    // System.out.print(list.get(i));
    // }

    // get operation //TC=0(1)
    int element = list.get(2);
    System.out.println(element);

    // remove element O(n)
    list.remove(2);
    System.out.println(list);

    // set O(n)
    list.set(0, 5);
    System.out.println(list);

    // contains
    System.out.println(list.contains(8));
    System.out.println(list.contains(99));

    // final
    System.out.println(list);

    // reverse
    System.out.println("reverse list is");
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.print(list.get(i));
    }
    // find maximum
    System.out.println("\nmaximum is::");
    int max=Integer.MIN_VALUE;   // -infinite
    for(int i=0;i<list.size();i++){
      if(max<list.get(i)){
        max=list.get(i);
      
      }
    }
    System.out.println(max);
    
    //swap index 1 and 3
     int temp=list.get(1);
   list.set(1,list.get(3));
   list.set(3,temp);
   System.out.println(list+" ");

   // Sort using in built sort method of collections class
     Collections.sort(list);            // accending
     System.out.println(list);
     Collections.sort(list,Collections.reverseOrder());    //decending
     System.out.println(list);
    }}
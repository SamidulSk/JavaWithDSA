// Unioun and intersection

import java.util.HashSet;

public class Hashmap9{
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();

        // union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union= "+set.size());
        //print elements
        for(Integer i : set){
            System.out.print(i);
        }        

        // Intersection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int Count=0;
        System.out.println("\nIntersection elements are->");
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                Count++;
                System.out.print(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println("\nMy Intersection = "+ Count);
    }
}
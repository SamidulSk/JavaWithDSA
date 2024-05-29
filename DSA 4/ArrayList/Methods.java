// intro to Arraylist

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(9);
        System.out.println(list.get(3));
        list.remove(1);
        list.set(0, 2);
        System.out.println(list.contains(9));
        System.out.println(list.size());
        System.out.println(list.indexOf(2));
        list.sort(null);

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}

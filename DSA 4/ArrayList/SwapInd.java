// swap element of two index

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapInd {
    public static void swap(ArrayList<Integer> list, int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(9);
        System.out.println(list);
        int index1=1;
        int index2=3;
        swap(list, index1, index2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

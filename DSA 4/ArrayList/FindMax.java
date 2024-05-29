// find maximum element in list

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(7);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            // max=Math.max(list.get(i), max)
        }
        System.out.println(max);
    }
}

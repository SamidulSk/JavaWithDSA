import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

// multi-dimention array list
class MultiDArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();  // create 2D arraylist
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        list1.add(7);
        list1.add(0);
        list2.add(5);
        list1.add(5);
        list2.add(9);
        list2.add(3);
        mainlist.add(list1 );
        mainlist.add(list2);
        System.out.println(mainlist);

        //list
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>cuArrayList=mainlist.get(i);   // mainlist ka i pe ek pura list hay
            for(int j=0;j<cuArrayList.size();j++){
                System.out.print(cuArrayList.get(j)+" ");
            }
        }
    }
}
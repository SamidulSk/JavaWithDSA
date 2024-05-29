import java.util.ArrayList;

public class MultiDList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        
        // list1
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        // list 2
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        // list 3
        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        // add to main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        // print using nested loop
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
    }
}

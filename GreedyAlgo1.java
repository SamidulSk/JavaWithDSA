import java.util.ArrayList;
import java.util.*;

// Max Activity selection problem  -->>> O(n)
public class GreedyAlgo1{
    public static void main(String args[]){
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]=  {2, 4, 6, 7, 9, 9};
        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();  // to store index of Activities

        // perform first activity
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];  // store the end time of last activity
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){  // condition for activity selection
              maxAct++;
              ans.add(i);
              lastEnd=end[i];
            }
        }
        System.out.println("max Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
    }
}
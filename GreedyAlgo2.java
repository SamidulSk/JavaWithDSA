import java.util.ArrayList;
import java.util.*;

// Max Activity selection problem  -->> if Activities are not sorted according to end time   -->>O(nlogn)
public class GreedyAlgo2{
    public static void main(String args[]){
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]=  {2, 4, 6, 7, 9, 9};
        
        //sorting
        int Activities[][]=new int[start.length][3];  // initialize a 2-D array
        for(int i=0;i<start.length;i++){
            Activities[i][0]=i;
            Activities[i][1]=start[i];
            Activities[i][2]=end[i];
        }
        // lambda function -> 
        Arrays.sort(Activities,Comparator.comparingDouble(o ->o[2]));
        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();  // to store index of Activities

        // perform first activity
        maxAct=1;
        ans.add(Activities[0][0]);
        int lastEnd=Activities[0][2];  // store the end time of last activity
        for(int i=0;i<end.length;i++){
            if(Activities[i][1]>=lastEnd){  // condition for activity selection
              maxAct++;
              ans.add(Activities[i][0]);
              lastEnd=Activities[i][2];
            }
        }
        System.out.println("max Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
    }
}
import java.util.Arrays;
import java.util.Comparator;

// Fractional Knapsack-->> Greedy approach
public class Knapsack{
    public static void main(String args[]){
        int val[]={60, 100, 120};
     int weight[]={10,  20,  30};
     int W=50;
     double ratio[][]=new double[val.length][2];
     //0th col-> index and first col-> ratio
     for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
     }
     //sort in acending
     Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));  // this sort as accending
     int capacity=W;
     int value=0;
     for(int i=ratio.length-1;i>=0;i--){         // for decending because we want high ratio item first
        int index=(int)ratio[i][0];
        if(capacity>=weight[index]){
              value=value+val[index];
              capacity=capacity-weight[index];
        }
        else{
            //include fractional item
            value=value+(int)(ratio[i][1]*capacity);
            capacity=0;
            break;
        }
     }
     System.out.println( "Final value = "+value);

    }
}
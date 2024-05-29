import java.util.ArrayList;
// find pair sum in a sorted and rotated list O(n)
public class PairSumAdv {
    public static boolean pairsum(ArrayList<Integer>list , int target){
        // breaking point - pivot index
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)> list.get(i+1)){ // breaking point
                bp=i;
                break;
            }
        }
        int lp=bp+1; // smalles element
        int rp=bp; // largest element
         while (lp != rp) {
            // case 1
            if(list.get(lp)+ list.get(rp)==target){
                return true;
            }
            //  case 2
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }
            // case 3
            else{
                rp=(list.size()+rp-1)%list.size();
            }
         }
         return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // 11,15,6,8,9,10 - sorted and rotate
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(10);
        int target=136;
        System.out.println(pairsum(list, target));
    }
}

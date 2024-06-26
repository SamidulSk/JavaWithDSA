import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0); // peek first activity
        maxAct = 1;
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                ans.add(i);
                maxAct++;
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum no of acitity is = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("  A"+ans.get(i));
        }
        System.out.println();
    }
}

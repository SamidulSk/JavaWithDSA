import java.util.ArrayList;

public class Maxwater {
    public static int maxWater(ArrayList<Integer>height){
        int maxwater=0;
        for(int i=0;i<height.size();i++){  // brute force O(n2)
            for(int j=i+1;j<height.size();j++){
                int containerHeight=Math.min(height.get(i), height.get(j));
                int containerWidth=j-i;
                int water= containerHeight*containerWidth;
                if(water>=maxwater){
                    maxwater=water;
                }
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWater(height));
    }
}

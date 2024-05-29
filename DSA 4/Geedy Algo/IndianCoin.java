import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 3, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int amount=590;
        int countOfcoins=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while (coins[i]<=amount) { // 20 rupiya kitna bar?
                    ans.add(coins[i]);
                    countOfcoins++;
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " +countOfcoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}

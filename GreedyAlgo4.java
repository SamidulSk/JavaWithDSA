import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//we are given an infinite supply of coins [1,2,,5,10,20,50,100,500,2000] find minimum number of coins to make change for a value V.
// indian coins problem
// V=590
public class GreedyAlgo4 {
    public static void main(String args[]) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countofcoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofcoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used =" + countofcoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
        System.out.println();
    }

}
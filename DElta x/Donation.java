import java.util.Scanner;

public class Donation {

    public static int maxDonation(int n, int[] d) {
        int max_donation = 0;
        int curr_sum = 0;

        for (int i = 0; i < n; i++) {
            if (d[i] > 0) {
                curr_sum += d[i];
                max_donation = Math.max(max_donation, curr_sum);
            } else {
                curr_sum = 0;
            }
        }

        return max_donation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }

        System.out.println(maxDonation(n, d));
    }
}

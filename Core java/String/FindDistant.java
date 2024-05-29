import java.util.Scanner;

public class FindDistant {
    public static float findShortestDistance(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            }
        }

        int distanceSquared = x * x + y * y;
        return (float) Math.sqrt(distanceSquared);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of directions (e.g., 'NNEEWSW'): ");
        String str = scanner.nextLine();
        scanner.close();

        float distance = findShortestDistance(str);
        System.out.println("Shortest distance: " + distance);
    }
}

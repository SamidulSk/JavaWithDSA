import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Puzzlewille {

    public static void findCombinations(List<Integer> arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            if (i > index && arr.get(i).equals(arr.get(i - 1))) continue;
            if (arr.get(i) > target) break;
            current.add(arr.get(i));
            findCombinations(arr, target - arr.get(i), i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }

        A.sort(Integer::compareTo);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        findCombinations(A, K, 0, current, result);

        System.out.println(result.size());
    }
}

// find largest string in lexicography order
// a-> smallest
// z-> largest

public class LargestStr {
    public static String findLargest(String fruit[]) {
        String largest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        String fruit[] = { "apple", "banana", "mango" };
        System.out.println(findLargest(fruit));
    }
}

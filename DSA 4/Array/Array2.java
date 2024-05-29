package Array;
//passing to function
public class Array2 {
    public static void update(int marks[], int val) {
        val++;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 5;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String argsg[]) {
        int val = 66;
        int marks[] = { 44, 67, 92 };
        printArray(marks);
        update(marks, val);
        System.out.println(val); // value in not change because of pass by value
        printArray(marks);  // it is change because of pass by reference
 
    }
}

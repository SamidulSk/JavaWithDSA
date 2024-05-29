package Array;
// Linear Search
public class Array3 {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchString(String str[], String key) {
        for(int i=0;i<str.length;i++){
            if(str[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 456, 32, 87, 89, 12, 43, 55 };
        String str[]={"apple","banana","Mango","jackfruit"};
        System.out.println("This key is present in index no : " + linearSearch(arr, 43));
        System.out.println("Mango is present in index no : " + linearSearchString(str, "Mango"));
    }
}

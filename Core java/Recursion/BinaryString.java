// binary string without consecutive ones
public class BinaryString {
    public static void printStrings(int n, int lastplace, String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // 0 kavibi add karlo
        printStrings(n-1, 0, str+"0");
        // one tavi add karo jav lastplace 0 ho
        if(lastplace==0){
            printStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printStrings(3, 0, "");
    }
}

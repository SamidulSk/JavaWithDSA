//
public class Powerof2ornot {
    public static boolean ispoweror2(int n){
        if ((n & (n - 1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n=16;
        System.out.println(ispoweror2(n));

    }
}

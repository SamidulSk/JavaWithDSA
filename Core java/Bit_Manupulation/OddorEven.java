public class OddorEven{
    public static void oddOreven(int n){
        int bitmask=1;
        if((n&bitmask)==1){
            System.out.println("This is odd number");
        }
        else{
            System.out.println("This is a even number");
        }
    }
    public static void main(String args[]){
        int n=16;
        oddOreven(n);
    }
}
// check if a number is odd or even
class BitManipulation3{
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even number");
        }
        else {
            System.out.println(" Odd number");
        }
    }
    public static void main(String args[]){
        OddOrEven(6);
        OddOrEven(5);
        OddOrEven(0);

    }
}
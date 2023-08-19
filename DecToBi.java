import java.text.DecimalFormat;

class DecToBi{
    public static void decimalToBinary(int n){
        int mynum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int remender=n%2;
            binNum=binNum+(remender*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+ mynum + " is  "+ binNum);
    }    public static void main(String args[]){
        decimalToBinary(5);
    }
}
// sum of digit
public class Function29 {
    public static int sumOfDigit(int digit){
        int sum=0;
        while(digit>0){
            int lastDigit=digit%10;
            sum=sum+lastDigit;
            digit/=10;
        }
        return sum;
    }
    public static void main(String args[]){
System.out.println(sumOfDigit(5455));
    }
}

// print sum of first n natural numbers
class Recursion4{
    public static int sumofNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumofNumbers(n-1);
    }
     public static void main(String args[]){
      System.out.println(sumofNumbers(5));
     }
}
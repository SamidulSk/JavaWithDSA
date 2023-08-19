// calculate x to the power n
class Recursion7{
    public static int power(int x, int n){
        if(x==0){
            return 0;
        }
        if(x==1 || n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        else return x*power(x, n-1);
    }
    public static void main(String args[]){
     System.out.println(power(2, 3));
    }
}
public class Prime26 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                return false;
            }

        }
        return isPrime;
    }

    public static void primeInRange(int range){
        for( int i=2;i<=range;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {

        System.out.println(isPrime(49));
        primeInRange(100);
    }
}

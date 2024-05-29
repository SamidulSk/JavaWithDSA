public class Function25 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BinomialCoefficient(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nMinusr_fact=factorial(n-r);
        return (n_fact)/(r_fact*nMinusr_fact);
    }
    public static void main(String args[]) {

        System.out.println(factorial(5));

        System.out.println( BinomialCoefficient(5, 2));
        System.out.println( BinomialCoefficient(4, 2));
    }
}

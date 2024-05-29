public class Tiling {
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        // vertical choice
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}

import java.util.Scanner;
class Fuction9 {
    public static float circumOfCircle(int r) {
        return 2*3.14f*r;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("The circumfarence of circle is :"+circumOfCircle(r));

    }
}
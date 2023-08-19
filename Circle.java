import java.util.*;
class Circle{
    static float pi=3.14f;
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r=Sc.nextInt( );
        float area=pi*r*r;
        System.out.println("The area of circle is "+area);
    }
}
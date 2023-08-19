import javax.lang.model.element.Element;

//Write a program to find the largest number among three numbers using if-else statements.
public class QNA1{
    public static void main(String args[]){
        int a=9;
        int b=5;
        int c=78;
        if(a>b&&a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}
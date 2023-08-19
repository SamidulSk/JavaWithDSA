// Abstract class
abstract class parent{
    void sayHello(){
        System.out.println("Hello");
    }
   abstract void greet();     // abstract method
}
class child1 extends parent{
    void greet(){
        System.out.println("Good morning");
    }
}
class child2 extends parent{
    void greet(){
        System.out.println("Good night");
    }
}
public class Oops12{
    public static void main(String args[]){
        child1 ch=new child1();
        ch.greet();
        parent p1= new child2();  // reference of parent class
        p1.greet();

    }
}
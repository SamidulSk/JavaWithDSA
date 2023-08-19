// Hierarchical Inheritance
// there are one base class and multiple derived class
class Animals{
    void eat(){
        System.out.println("Eat");
    }
    void movoment(){
        System.out.println("Have movement");
    }
}
class bird extends Animals{
    void fly(){
        System.out.println("can fly");
    }
    void wings(){
        System.out.println( " Have two wings");
    }
}
class dog extends Animals{
    void shout(){
        System.out.println("can shout");
    }
    void teeth(){
        System.out.println( "have teeth");
    }
}
public class Oops10{
 public static void main(String args[]){
    dog d1=new dog();
    bird b1=new bird();
    d1.eat();
    d1.teeth();
   // d1.fly();
    b1.fly();
 }
}
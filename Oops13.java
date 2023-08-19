// Interface:>> all the methods are abstract
interface engine{
    public void capacity();
    public void company();
}
interface body{
    public void style();
    public void color();
}
class car implements engine,body{
    public void capacity(){
        System.out.println("Capacity is 200 hp");
    }
    public void company(){
        System.out.println("TATA");
    }
    public void style(){
        System.out.println("Unique");
    }
    public void color(){
        System.out.println("White");
    }
    public void speed(){
        System.out.println("Super speed");
    }
}
public class Oops13{
    public static void main(String args[]){
    car c1=new car();
    c1.color();
    c1.capacity();
    c1.speed();
    }
}
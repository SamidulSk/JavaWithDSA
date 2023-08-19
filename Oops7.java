// Inheritance
class Base{                    //super class
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base class and setting the value of x");
        this.x=x;
    }
    public void PrintMe(){
        System.out.println("i am a method");
    }
}
class Derived extends Base{           //subclass
   int y;
   public int getY(){
    return y;
   }
   public void setY(int y){
    this.y=y;
   }
}
public class Oops7{
    public static void main(String args[]){
        // creating a object of base class
       // Base b=new Base();                        // base class only access X
       // creting a object of derived class
        Derived b=new Derived();                    // derived class can access X and Y
        b.setX(49);
        System.out.println("This is "+b.getX());
        b.setY(90);
        System.out.println(b.getY());

    }
}
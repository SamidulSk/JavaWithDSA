// create a class square with a method to initialize its side , calculating area and perimeter
class rectangle{
    int length;
    int wigth;
    public int area(){
      return length*wigth;
    }
    public int perimeter(){
        return (length+wigth);
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Oops3{
    
    public static void main(String args[]){
        Square sq=new Square();
        sq.side=8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        rectangle r1=new rectangle();
        r1.length=9;
        r1.wigth=5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }
}
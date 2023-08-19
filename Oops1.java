// creatint our first custom class
class Employee{
    int id;           //Attributes 
    String name;
    public void printdetails(){          //method
        System.out.println("My id no is "+ id);
        System.out.println("My name is "+ name);

    }
}

public class Oops1{
    public static void main(String arfs[]){
        //initiating a new object of employee class
        Employee samidul=new Employee();
        Employee harry=new Employee();
        //setting Attributes
        samidul.id=54;
        samidul.name = "SK SAMIDUL HOSSAIN";
        harry.id=67;
        harry.name="CodeWithHarry";
      //  System.out.println(samidul.id);
       // System.out.println(samidul.name);
        samidul.printdetails();
        harry.printdetails();

    }
}
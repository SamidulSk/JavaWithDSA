import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

// creting a employee class with following properties
// salary
// get salary
// name
// getname
/// set name
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
          name=n;
    }
}
public class Oops2{
   
    public static void main(String args[]){
        Employee harry=new Employee();
        harry.salary=90;
        harry.name="haris ali khan";
        
        System.out.println(harry.salary);
    
        System.out.println(harry.getSalary());
        System.out.println(harry.name);
        harry.setname("samidul");
        System.out.println(harry.name);
    

    }
}
import javax.print.attribute.SetOfIntegerSyntax;

// Getters and Setters in java
class Employee {
   private int id;
    private String name;
    public void setid(int n){
        this.id=n;
    }
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String S){
        this.name=S;
    }

}

public class Oops5 {
    public static void main(String args[]) {
        Employee harry = new Employee();
       harry.setid(99);
       System.out.println(harry.getid());
       System.out.println(harry.getName());

    }
}
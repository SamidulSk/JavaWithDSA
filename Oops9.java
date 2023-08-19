// single level inheritance
class Vehicle{
    void run(){
        System.out.println(" can run");
    }
    void gas(){
        System.out.println(" produce some gas");
    }
    void oil(){
        System.out.println(" required oil for run");
    }
}
class bike extends Vehicle{
    void petrol(){
        System.out.println("Bike required petrol for run");
    }
    void wheel(){
        System.out.println("Bike have two wheel");
    }
}
public class Oops9{
    public static void main(String args[]){
        bike b1=new bike();
        b1.wheel();
        b1.gas();

    }
}
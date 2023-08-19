// create a class Tommy for rockstar Games capable of hitting,running, firing etc...
class Tommy{
    public void hit(){
        System.out.println("Hitting to the enemy....");
    }
    public void run(){
        System.out.println("Running from enemy.....");
    }
    public void fire(){
        System.out.println("Fireing on the enemy");
    }
}
class Oops4{
    public static void main(String args[]){
   Tommy t1=new Tommy();
   t1.hit();
   t1.run();
   t1.fire();
    }
}
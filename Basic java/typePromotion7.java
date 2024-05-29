
public class typePromotion7 {
    public static void main(String args[]){
        byte b=4;
        char c='a';
        short s=512;
        int i=1000; 
        float f=3.14f;
        double d=99.9954;
        Object result = (f * b) + (i % c) - (d * s);

        // Print the data type of 'result'
        System.out.println("Data Type of 'result': " + result.getClass().getName());
    }
}
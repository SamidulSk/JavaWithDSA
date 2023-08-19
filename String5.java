// String str="hello" and
// String str=new String("hello") are not same
class String5{
    public static void main(String args[]){
        String s1="samidul";
        String s2="samidul";
        String s3=new String("samidul");
        if(s1==s2){
            System.out.println("This is equal");
        }
        else{
            System.out.println("This is not equal");
        }
        if(s1==s3){
            System.out.println("This is equal");
        }
        else{
            System.out.println("This is not equal");
        }
        // we have to compare two string by  value // using java function
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }
         
    }
}
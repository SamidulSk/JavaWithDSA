//print all latter of string
class String2{
    public static void PrintLatters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str="I love java";
        PrintLatters(str);

    }
}
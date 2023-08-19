// print substring using method str.substring(0,2);
class String6{
    public static void SubString(String str,int si,int ei){
        for(int i=si;i<ei;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str="Hello World";
        SubString(str, 0, 4);
        System.out.println(str.substring(0,6));
    }
}
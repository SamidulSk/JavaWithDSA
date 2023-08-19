//String Builder 
class String8{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder(" ");
       // sb.toString();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
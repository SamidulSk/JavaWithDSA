class BitManipulation2{
    public static void main(String args[]){
        // Binary one's complement 
        System.out.println(~5);

        // Binary Left shift
        System.out.println(5<<3);
        // 5->> 0000101
        // 5<<3 = 0101000 ==40
        //a<<b = a*2^b

        // Binary Right shift
        System.out.println(5>>2);
        // 5->> 0000101
        // 5>>2 = 0000001 ==1
        //a>>b = a/2^b

    }
}
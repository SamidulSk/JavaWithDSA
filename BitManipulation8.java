// clear i th bit 
class BitManipulation8{
    public static int clearIBit(int n,int i){
        int bitMask=(~0)<<i; // or -1<<i
        return n& bitMask;
    }
    public static void main (String args[]){
     System.out.println(clearIBit(15, 2));
    }
}
// update ith bit with 0 or 1
class BitManipulation7{
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int updateIthBit(int n,int i, int SorC){
        if(SorC==0){
            return clearIthBit(n, i);
        }
        else {
            return setIthBit(n, i);
        }
    }
    public static void main(String args[]){
     System.out.println(updateIthBit(10, 0, 1));
    }
}
// Get ith bit of number
class BitManipulation4{
    public static int getIthbit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else 
        return 1;
    }
    public static void main(String args[]){
        System.out.println(getIthbit(4, 1)); 
        System.out.println(getIthbit(10, 1)); 
        System.out.println(getIthbit(10, 0)); 
        
        

    }
}
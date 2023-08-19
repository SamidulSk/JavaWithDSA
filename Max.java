class Max{
    public static void main(String[] args){
        int x=9;
        int y=3;
        int z=8;
        if(x>y&&x>z){
            System.out.println(x);
        }
        else if(y>z&&y>x){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
}
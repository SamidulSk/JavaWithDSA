// print out the sum of the numbers in the second row 
public class Ques1 {
    public static int sumOfsecondRow(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(sumOfsecondRow(nums));
    }
}

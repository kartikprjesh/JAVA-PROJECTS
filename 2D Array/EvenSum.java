import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of row:");
        int row=sc.nextInt();
        System.out.println("Enter the value of colum:");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int sum=0;
        System.out.println("---------------------");
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                
                if(arr[i][j]%2==0){
                     sum+=arr[i][j];
                }

            }
           
            
        }
         System.out.println("Even sum is"+sum);
    

    }
    
}

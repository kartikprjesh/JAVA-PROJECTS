import java.util.*;

public class posNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int row=sc.nextInt();
        System.out.println("Enter the size of colum:");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr [i][j]=sc.nextInt();

            }
        }
        System.out.println("------------------------");
        System.out.println("----Value is----");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i][j] > 0) {
    System.out.println(arr[i][j] + " is Positive");
}
else if (arr[i][j] < 0) {
    System.out.println(arr[i][j] + " is Negative");
}
else {
    System.out.println(arr[i][j] + " is Zero");
}
            }
        }

    }
    
}

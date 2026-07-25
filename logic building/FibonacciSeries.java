import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        int t1=0,t2=1;
        System.out.print("Fibonacci Series: "+t1+","+t2);
        for(int i=2;i<n;i++){
            int t3=t1+t2;
            System.out.print(","+t3);
            t1=t2;
            t2=t3;  
    }
    
}
}

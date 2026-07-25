import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array...");
        int n=sc.nextInt();
        int arr[] =new int[n];
       System.out.println("Enter the elements of array...");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=arr[i];
       }
       double average=(double) sum/n;
       System.out.println("Average is"+average);


    }
    
}

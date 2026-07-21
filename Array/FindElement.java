
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element...");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array...");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("which element want to find you.. ");
        int s=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.println("Element found!!");
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
    
}

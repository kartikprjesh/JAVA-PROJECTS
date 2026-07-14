
import java.util.Scanner;



public class example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of y:");
        y=sc.nextInt();

        if(x>y){
            System.out.println("X is greter then y");
        }
        else{
            System.out.println("Y is greter then x");
        }
        
        
        
    }
    
}

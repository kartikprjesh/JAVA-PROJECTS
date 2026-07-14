import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,choice;
        System.out.println("Enter the value of first number:");
        x=sc.nextInt();
        System.out.println("Enter the value of second number:");
        y=sc.nextInt();
        System.out.println("Enter your choice :\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("Addition of two numbers is: "+(x+y));
        }
        else if(choice==2){
            System.out.println("Subtraction of two numbers is: "+(x-y));
        }
        else if(choice==3){
            System.out.println("Multiplication of two numbers is: "+(x*y));
        }
        else if(choice==4){
            System.out.println("Division of two numbers is: "+(x/y));
        }
        else{
            System.out.println("Invalid choice");


        }

        sc.close();
    }

    
}

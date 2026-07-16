import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th evalue of x");
        int a=sc.nextInt();
        System.out.println("Enter the value of y");
        int b=sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        String operation=sc.next();
        switch (operation) {
            case "+":
                System.out.println("The sum of two numbers is: " + (a + b));
                break;
            case "-":
                System.out.println("The difference of two numbers is: " + (a - b));
                break;
            case "*":
                System.out.println("The product of two numbers is: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("The division of two numbers is: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
    
}

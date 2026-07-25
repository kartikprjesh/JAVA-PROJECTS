
import java.util.Scanner;

public class rectangle {
    double length;
    double breadth;

   rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;

   }
   void calculateArea(){
    double area=length*breadth;

    System.out.println("\n Area of rectangle = "+area);
   }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length: ");
    double length=sc.nextInt();
    System.out.println("Enter breadth: ");
    double breadth=sc.nextInt();

    rectangle r1=new rectangle(length, breadth);
    r1.calculateArea();
   }

    
    
}

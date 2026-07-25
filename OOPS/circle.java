import java.util.Scanner;

public class circle {
    double radius;  

     circle(double radius) {
        this.radius = radius;
    }

    void calculateArea(){
        double area=Math.PI*radius*radius;
          System.out.printf("Area = %.2f\n", area);

    }
    void calculateCircumference(){
    double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference = %.2f\n", circumference);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        circle c1 = new circle(radius);

        c1.calculateArea();
        c1.calculateCircumference();

        sc.close();
    }
}


    
    


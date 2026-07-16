import java.util.Scanner;

public class Area_calculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();

                double circleArea = 3.14 * radius * radius;

                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();

                System.out.print("Enter width: ");
                double width = scanner.nextDouble();

                double rectangleArea = length * width;

                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
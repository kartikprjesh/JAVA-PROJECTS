import java.util.Scanner;

public class Menu_bar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Bar Options:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Pizza");
                break;

            case 2:
                System.out.println("You selected Burger");
                break;

            case 3:
                System.out.println("You selected Pasta");
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
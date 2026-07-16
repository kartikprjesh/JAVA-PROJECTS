import java.util.Scanner;

public class loopmenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== LOOP PROGRAMS =====");
        System.out.println("1. Print 1 to 10");
        System.out.println("2. Print 10 to 1");
        System.out.println("3. Print Even Numbers");
        System.out.println("4. Print Odd Numbers");
        System.out.println("5. Multiplication Table");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
                break;

            case 2:
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
                break;

            case 3:
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 4:
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 5:
                System.out.print("Enter number: ");
                int num = scanner.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
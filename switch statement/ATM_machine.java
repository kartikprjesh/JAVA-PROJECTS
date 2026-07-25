import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine");
        System.out.print("Enter your choice (1. Check Balance, 2. Withdraw, 3. Deposit): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is $1000.");
                break;

            case 2:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                System.out.println("You have withdrawn $" + withdrawAmount);
                break;

            case 3:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                System.out.println("You have deposited $" + depositAmount);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        scanner.close();
    }
    
}

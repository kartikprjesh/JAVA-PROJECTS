import java.util.Scanner;
public class Grade_message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, F): ");
        String grade = scanner.nextLine().toUpperCase();

        switch (grade) {
            case "A":
                System.out.println("Excellent! You did a great job.");
                break;
            case "B":
                System.out.println("Good job! Keep up the good work.");
                break;
            case "C":
                System.out.println("You passed, but there's room for improvement.");
                break;
            case "D":
                System.out.println("You need to work harder. Don't give up!");
                break;
            case "F":
                System.out.println("Unfortunately, you failed. Consider seeking help.");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
        }

        scanner.close();
    }
}
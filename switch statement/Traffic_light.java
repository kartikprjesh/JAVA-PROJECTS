import java.util.Scanner;
public class Traffic_light {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Get ready to stop.");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color entered. Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}
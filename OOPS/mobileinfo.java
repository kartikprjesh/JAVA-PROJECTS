
import java.util.Scanner;

public class mobileinfo {
    String company_name;
    String model;
    int RAM;
    int storage;

    void displaydetails() {
    System.out.println("--------------------");
    System.out.println("Company Name: " + company_name);
    System.out.println("Model Name: " + model);
    System.out.println("RAM: " + RAM + " GB");
    System.out.println("Storage (ROM): " + storage + " GB");
    System.out.println("--------------------");
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mobileinfo mob=new mobileinfo();
        System.out.println("Enter the Company name: ");
        mob.company_name = sc.nextLine();
        System.out.println("Enter the Model Name: ");
        mob.model=sc.nextLine();
        System.out.println("Enter the RAM: ");
        mob.RAM=sc.nextInt();
        System.out.println("Enter the Storage(ROM): ");
        mob.storage=sc.nextInt();

        mob.displaydetails();

    }


    
}

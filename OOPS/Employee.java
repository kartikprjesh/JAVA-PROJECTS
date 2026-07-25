
import java.util.Scanner;

public class Employee {
    String name;
    int id ;
    double salary;

    void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Id is: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee E1=new Employee();
        System.out.println("Enter the name of Employee");
         E1.name=sc.nextLine();
         System.out.println("Enter the ID:");
         E1.id=sc.nextInt();
         System.out.println("Enter the salary of Employee:");
         E1.salary=sc.nextDouble();


         E1.displayDetails();

    }


    
}

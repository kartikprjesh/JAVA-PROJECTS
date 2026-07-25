
import java.util.Scanner;

public class student2 {
    String name;
    int rollno ;
    double marks;

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No is:"+rollno);
        System.out.println("Marks: "+marks);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student2 s1=new student2();
        System.out.println("Enter the name of student");
         s1.name=sc.nextLine();
         System.out.println("Enter the roll no:");
         s1.rollno=sc.nextInt();
         System.out.println("Enter the marks of student:");
         s1.marks=sc.nextDouble();


         s1.displayDetails();

    }


    
}

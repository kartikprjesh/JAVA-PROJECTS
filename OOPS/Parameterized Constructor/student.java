
import java.util.Scanner;



public class student {

    String name;
    int rollno;
    double marks;

    student(String name,int rollno,double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;

    }

    void displayDetails(){
        System.out.println("\n---- student details----");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Marks: "+marks );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter Roll no:");
        int rollno=sc.nextInt();
        System.out.println("Enter the marks");
        double marks=sc.nextDouble();
         

        student s1=new student(name, rollno, marks);
        s1.displayDetails();
        
    }
    
}

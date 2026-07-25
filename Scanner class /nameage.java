import java.util.Scanner;

public class nameage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("your name is "+name+" and your age is" +age);
        sc.close();

    }
    
}

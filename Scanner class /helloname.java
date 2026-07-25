import java.util.Scanner;

public class helloname {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Hello "+name);
        sc.close();
        

    }
    
}

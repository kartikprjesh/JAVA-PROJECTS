
import java.util.Scanner;


public class Book {
    String title;
    String author;
    double price;


   void displaybook(){
    System.out.println("title is: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price is: "+price);
    System.out.println("--------------------------");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b1=new Book();
        System.out.println("Enter the title  of book: ");
        b1.title=sc.next();
        System.out.println("Enter the author of book: ");
        b1.author=sc.next();
        System.out.println("Enter the price of book: ");
        b1.price=sc.nextInt();

         b1.displaybook();
    }

 
    
}

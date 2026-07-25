
import java.util.Scanner;

public class car {
    String brand;
    int model_No;
    double price;


    void showCarDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model No. "+model_No);
        System.out.println("Price: "+price);
        System.out.println("-----------------------");
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        car c1=new car();
        System.out.println("Enter the Brand: ");
        c1.brand=sc.nextLine();
        System.out.println("Enter the model no.: ");
        c1.model_No=sc.nextInt();
        System.out.println("Enter the price: ");
        c1.price=sc.nextDouble();


        c1.showCarDetails();
        
    }

    
}

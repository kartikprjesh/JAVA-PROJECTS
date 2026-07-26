import java.util.Scanner;

public class bike {
    String company;
String model;
int mileage;
double price;

bike(String company,String model,int mileage,double price){
    this.company=company;
    this.model=model;
    this.mileage=mileage;
    this.price=price;
}
void displayDetails(){
    System.out.println("Company is: "+company);
    System.out.println("Model is: "+model);
    System.out.println("Mileage is: "+mileage);
    System.out.println("Price: "+price);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    bike b=new bike(null, null, 0, 0);
    System.out.println("Enter Bike's company name: ");
    b.company=sc.nextLine();
    System.out.println("Enter the model name: ");
    b.model=sc.nextLine();
    System.out.println("Enter the Mileage: ");
    b.mileage=sc.nextInt();
    System.out.println("Enter the price: ");
    b.price=sc.nextDouble();
    System.out.println("------------------------------------------");



    b.displayDetails();
}
    
}

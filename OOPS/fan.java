import java.util.Scanner;

public class fan{
    String brand;
    int speed;
    double price;

    fan(String brand,int speed,double price){
        this.brand=brand;
        this.speed=speed;
        this.price=price;

    }
    void displayDeatils(){
        System.out.println("Brand : "+brand);
        System.out.println("speed : "+speed);
        System.out.println("price : "+price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fan f=new fan(null, 0, 0);
        System.out.println("Enter the Brand of fan: ");
        f.brand=sc.nextLine();
        System.out.println("Enter the speed of fan: ");
        f.speed=sc.nextInt();
        System.out.println("Enter the price of fan:");
        f.price=sc.nextDouble();


        f.displayDeatils();


    }


} 
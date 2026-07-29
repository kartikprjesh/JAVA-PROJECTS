package Inheritance;

class car{
    void start(){
        System.out.println("Car started...");
    }
}
class drive extends car{
    void drive(){
        System.out.println("Car is drive...");

    }
}

public class vehical {
    public static void main(String[] args) {
        drive d=new drive();
        d.start();
        d.drive();
        }
    
}

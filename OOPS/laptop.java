
import java.util.Scanner;

public class laptop {
    String company;
    String proccessor;
    int RAM;
    int ssd;
    double price;

    public laptop(String company,String proccessor,int RAM,int ssd,double price) {
        this.company=company;
        this.ssd=ssd;
        this.proccessor=proccessor;
        this.RAM=RAM;
        this.price=price;
    }


        void displaydetails(){
            System.out.println("company is: "+company);
            System.out.println("Proccessor is: "+proccessor);
            System.out.println("RAM is: "+RAM);
            System.out.println("SSD is: ");
            System.out.println("Price is: "+price);
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the company name:");
            String company=sc.nextLine();
            System.out.println("Enter the proccessor:");
            String proccessor=sc.nextLine();
            System.out.println("Enter the RAM:");
            int RAM=sc.nextInt();
            System.out.println("Enter the SSD:");
            int ssd=sc.nextInt();
            System.out.println("Enter the price:");
            double price=sc.nextDouble();

            laptop lp=new laptop(company, proccessor, RAM, ssd, price);

            System.out.println("\nLaptop details...");

            lp.displaydetails();
        }
    }

  
      
      


    
    


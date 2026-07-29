package Inheritance;

import java.util.Scanner;


class Doctor{
    String name;
    String specilization;
    

     void displayDoctor(){
        System.out.println("Name: "+name);
        System.out.println("specilization: "+specilization);
        
        
    }
    

}
class Surgeon extends Doctor{
        int experience;
        
        void performSurgery(){
            System.out.println("Surgery perfomed successfully....");
        }
        void displaySurgoun(){
            System.out.println("Experience is: "+experience);
        }

    }

public class hospitalManegment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Surgeon s = new Surgeon();


        System.out.println("Enter the name of Doctor: ");
        s.name=sc.nextLine();
        System.out.println("Enter the specilization: ");
        s.specilization=sc.nextLine();
        System.out.println("Enter experience: ");
        s.experience=sc.nextInt();

        System.out.println("----------------------------");

        s.displayDoctor();
        s.displaySurgoun();
        s.performSurgery();
    }
    
}

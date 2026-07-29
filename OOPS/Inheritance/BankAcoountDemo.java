package Inheritance;

import java.util.Scanner;



class BankAccount{
    double balance=0;
    void deposite(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited: "+amount);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance=balance-amount;
            System.out.println("Amount withdraw: "+amount);
        }
        else{
            System.out.println("Insufficient balance! ");
        }
    }
    void checkBalance(){
        System.out.println("Current balance: "+balance);
    }

}
class savingAccount extends BankAccount
{
    void calculateInterest(){
        double interest=balance*0.5;
        System.out.println("Intreset: "+interest);
        System.out.println("Final Balance: "+(balance+interest));
    }
}




public class BankAcoountDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        savingAccount obj=new savingAccount();
        System.out.println("Enter deposite amount: ");
        double deposite=sc.nextDouble();
        obj.deposite(deposite);

        System.out.println("Enter withdraw Amount: ");
        double withdraw=sc.nextDouble();
        obj.withdraw(withdraw);


        obj.checkBalance();
    
    }

    
}

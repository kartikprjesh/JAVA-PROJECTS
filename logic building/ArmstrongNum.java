import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(temp>0){
            r=temp%10;
            sum=sum+(r*r*r);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
    
}

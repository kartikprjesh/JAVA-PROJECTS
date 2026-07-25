
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();

        cal c=new cal();
        c.sum(a, b);
        c.sub(a, b);
        c.mul(a, b);
        c.div(a, b);

    }
    
}

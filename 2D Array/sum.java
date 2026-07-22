import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int sum=0;
        System.out.println("Enter th size of arrya:");
        size=sc.nextInt();
        int x[]=new int[size];
        System.out.println("Enter"+size+"values:");

        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        System.out.println("Given values are as below:  ");
        for(int i=0;i<size;i++){
            System.out.println(x[i]);
            sum=sum+x[i];
        }
        System.out.println("sum is:"+sum);

    }
    
}

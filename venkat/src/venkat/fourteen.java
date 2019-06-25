package venkat;

import java.util.Scanner;


public class fourteen {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer number:");
        int n=sc.nextInt();
        int c=0;
        
        if(n==1&&n==0)
            System.out.println("1 is neither prime nor composite");
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            c++;
        }
        if(c>0)
            System.out.println(n+" is not a prime number");
        else
            System.out.println(n+" is a prime number");
    }    

    
}
package venkat;

import java.util.Scanner;

public class evenodd {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		sc.close();
	}

}

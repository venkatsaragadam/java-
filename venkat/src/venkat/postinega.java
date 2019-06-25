package venkat;

import java.util.Scanner;

public class postinega {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num:");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("numberis positive ");
		}
		else if(n<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("zero ");
		}
				
	}
	

}

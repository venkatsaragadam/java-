package venkat;

import java.util.Scanner;

public class sixteen {
	
	public static void main(String[] args) {
		
		int n,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
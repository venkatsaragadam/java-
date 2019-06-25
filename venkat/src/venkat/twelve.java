package venkat;

import java.util.Scanner;

public class twelve {

	public static void main(String[] args) {
		
		int i,n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
			else
			{
				continue;
			}
		}
		
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
				System.out.println("not prime");
		}
	}

}

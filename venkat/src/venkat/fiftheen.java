package venkat;

import java.util.Scanner;

public class fiftheen {
	
	public static void main(String[] args) {
		
		int i,n,sum=0,m;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i>0;i++)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println("sum="+sum);
	}

}

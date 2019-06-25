package venkat;

import java.util.Scanner;

public class seventeen {

	public static void main(String[] args) {
		
		      int num=0;
		      int m=0;
		      Scanner in = new Scanner(System.in);
		      num = in.nextInt();
		      while( num != 0 )
		      {
		          m=m*10;
		          m=m+num%10;
		          num= num/10;
		      }
            System.out.println("reverse="+m);
	}

}

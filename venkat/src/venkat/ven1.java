package venkat;

public class ven1 {

	public static void main(String args[])
	{
	   int n=56789;
	   int max=0;
	   int min=9;
	   int re=0;
	   while(n>0) {
		   re=n%10;
		   if(re>max)
		   {
			   max=re;
		   }
		   if(re<min)
		   {
			   min=re;
		   }
		   n=n/10;
	   }
	   System.out.println("max and min is: "+max+ " "+min);
		

	}  

}

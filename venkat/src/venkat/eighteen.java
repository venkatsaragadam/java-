package venkat;

import java.util.Scanner;

public class eighteen{ 
	
 public static void main(String args[]){  
	 
  int r,sum=0,temp,n;    
  Scanner s=new Scanner(System.in); 
  n=s.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
package venkat;
import java.util.Scanner;

public class five {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in); 
	    char char1 =sc.next().charAt(0);
        if(char1>=48 && char1<=57)
        {
            System.out.print("char is Digit");

        }
        else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
        {
            System.out.print("char is Alphabet");
        }
        else
        {
            System.out.print("char is special character");

        }
        sc.close();
    }
}



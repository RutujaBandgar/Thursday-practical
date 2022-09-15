package corejava;
import java.util.*;

public class UpperCase
{

   public static void main (String[] args)
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Number for letter: ");
	   	int name = sc.nextInt();
	   	Scanner sn = new Scanner(System.in);
	   	System.out.print("Enter the letter  : ");
        String str = sn.nextLine();
        if(name==str.length())
        {
        	String upper_str = str.toUpperCase();
        	System.out.println("");
        	System.out.println("Original String: " + str);
        	System.out.println("String in Uppercase: " + upper_str);
        }
        else
        {
        	System.out.println("Invalid Input");
        }
    }
}

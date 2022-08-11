import java.lang.String;
public class SLNumber 
{
	public static void main(String[]args)
	{
		int n[] = new int[]{854,63,25,25,64,29,454,78,502};
		int smallest = n[0];
		int largest = n[0];
		for (int i = 1; i < n.length; i++)
		{
			if (n[i] > largest)
		    	largest = n[i];
			else if (n[i] < smallest)
		    	smallest = n[i];
		}
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);	
	}
}

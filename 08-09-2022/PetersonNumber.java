import java.util.Scanner;

public class PetersonNumber {
	public static int factorial(int n)
	{
		int fac=1;
		for(int i=1; i<=n; i++)
			fac=fac*i;
		return fac;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0 , num=n;
		while(n!=0)
		{
			int a=n%10;
			sum= sum + factorial(a);
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Number is Peterson");
		}
		else 
		{
			System.out.println("Number is not Peterson");
		}

	}

}

package corejava;
import java.util.Scanner;
public class LoopingNumber {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt(); 
		System.out.printf("N\t10*N\t100*N\t1000*N\n\n", num, num*10,num*100, num*1000); 
		for (int i=1; i<=num;i++)
		{ 
		System.out.printf("%d\t%d\t%d\t%d\n", i, i*10, i*100,i*1000);
		}
	}
}


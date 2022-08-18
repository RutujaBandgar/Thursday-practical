import java.util.Random;
import java.lang.String;
class Square extends Thread
{
	int x ;
	Square(int n)
	{
		x=n;
	}
	public void run()
	{
		if(x%2==0)
		{
			int sqr=x*x;
			System.out.println("square of "+x+"="+sqr);
		}
	}
}
class Cube extends Thread
{
	int x;
	Cube(int n)
	{
		x=n;
	}
	public void run()
	{
		if(x%2!=0)
		{
			int cub=x*x*x;
			System.out.println("Cube of"+x+"="+cub);
		}
	}
}
class Number extends Thread{
	public void run()
	{
		Random random=new Random();
		for(int i=0;i<4;i++)
		{
			int randomInteger=random.nextInt(100);
			System.out.println("Random Integer generated:"+randomInteger);
			if(randomInteger%2==0)
			{
				Square s=new Square(randomInteger);
				s.start();
			}
			else
			{
				Cube c=new Cube(randomInteger);
				c.start();
			}
			try
			{
				Thread.sleep(1000);
				System.out.println("-----------------");
			}catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}
public class Threadoddeven {
	public static void main(String[]args)
	{
		Number n=new Number();
		n.start();
	}
}
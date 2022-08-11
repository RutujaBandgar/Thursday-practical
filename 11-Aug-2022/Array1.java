import java.util.ArrayList;
import java.lang.String;

public class Array1{
	public static void main(String[]args)
	{
		ArrayList<String> Arr=new ArrayList<String>();
		Arr.add("Rutuja");
		Arr.add("Gouri");
		Arr.add("Prajkta");
		Arr.add("Pallavi");
		Arr.add("Akshata");
		System.out.println("elements of Arr:"+Arr);
		ArrayList<String> Arr1=new ArrayList<String>();
		Arr1.add("pooja");
		Arr1.add("Taskin");
		Arr1.add("Meghana");
		System.out.println("elements of Arr1:"+Arr1);
		Arr1.addAll(Arr);
		System.out.println("elements of both Arr and Arr1:"+Arr1);
		Arr1.remove("Pallavi");
		Arr1.remove("Taskin");
		System.out.println("elements after removing:"+Arr1);
		System.out.println("the element at 3rd index is:"+Arr1.get(3));
	}
}
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.lang.String;
public class RemoveDuplicate {
	public static void main(String[]args)
	{
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
	    primes.add(5);
	    primes.add(3);
	    primes.add(8); 
	    primes.add(8);
	    primes.add(11);
	    primes.add(12);
	    primes.add(15);
	    primes.add(26);
	    primes.add(12);
	    primes.add(19);
	    primes.add(2);
	    primes.add(5);
	    System.out.println("List of prime numbers:"+primes);
	    Set<Integer> primesWithoutDuplicates= new LinkedHashSet<Integer>(primes);
	    primes.clear();
	    primes.addAll(primesWithoutDuplicates);
	    System.out.println("list of primes without duplicates:"+primes); 
	}
}
package assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetToTree 
  {
	public static void main(String[] args)
		{
			  Set<String> bikes = new HashSet<String>();
			  		bikes.add("fz");
			  		bikes.add("bmw");
			  		bikes.add("pulser");
			  		bikes.add("dio");
					System.out.println("HashSet are= "+ bikes);
				Set<String> h= new TreeSet<>();
				h.addAll(bikes);
					System.out.println("TreeSet are= "+ h);
	}
}

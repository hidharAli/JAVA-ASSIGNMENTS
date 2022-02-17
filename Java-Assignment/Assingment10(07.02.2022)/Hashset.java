package assignment;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset
{
	public static void main(String[] args) {
		HashSet<String> bikes = new HashSet<String>();
  		bikes.add("fz");
  		bikes.add("bmw");
  		bikes.add("pulser");
  		bikes.add("dio");
		System.out.println("Traverse:"+bikes);
		System.out.println("HashSets Are:");
		Iterator<String> i=bikes.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

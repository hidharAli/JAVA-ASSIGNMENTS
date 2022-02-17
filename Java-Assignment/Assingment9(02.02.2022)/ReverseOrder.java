package assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrder {

	public static void main(String[] args) {
		LinkedList<Integer>a=new LinkedList<Integer>();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		Iterator<Integer> i=a.descendingIterator();
		while(i.hasNext())
		System.out.println(i.next());{
			System.out.println("Reverse Order In LinkedList:");
		}
	}
}

package newprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration 
{
	public static void main(String[] args)
{
		ArrayList<String>a=new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

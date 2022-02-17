package assignment;
import java.util.ArrayList;
public class Retrieve
{
	public static void main(String[] args) 
	{
		ArrayList<String>Cars=new ArrayList<String>();
		Cars.add("benz");
		Cars.add("verna");
		Cars.add("baleno");
		Cars.add("innova");
		Cars.add("xuv");
		System.out.println("ArrayList:"+Cars);
		String C=Cars.get(0);
		System.out.println("Printing The First Element:"+C);
		String C1=Cars.get(2);
		System.out.println("Printing The Third Element:"+C1);
	}
}

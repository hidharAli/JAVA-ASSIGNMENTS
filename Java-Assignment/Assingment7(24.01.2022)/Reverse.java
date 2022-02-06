package newprogram;

public class Reverse {

	public static void main(String[] args) 
	{
		String a="hidharmuhamed@gmail.com";
		int size=a.length();
		System.out.println("Reverse String is: "+a);
		for(int i=0;i<size;i++)
        {
        	System.out.print(a.charAt(a.length()-i-1));
        }
	}

}

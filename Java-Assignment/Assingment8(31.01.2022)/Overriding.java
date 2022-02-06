package newprogram;
class Poly1
{
	void display()
	{
		System.out.println("Java Programming Language");
	}
}

class polydemo extends Poly1
{
	void display()
	{
		System.out.println("Common English Language");
	}
}


public class Overriding {

	public static void main(String[] args) {
		Poly1 j=new  Poly1();
		polydemo m=new polydemo();
		j.display();
		m.display();
	}
}


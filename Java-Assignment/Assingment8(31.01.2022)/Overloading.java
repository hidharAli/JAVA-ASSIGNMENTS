package newprogram;
class polymorphism
{
	void display()
	{
		System.out.println("##########");
	}
	void display(int a)
	{
		System.out.println("*********");
	}
}

public class Overloading {

	public static void main(String[] args) {
		polymorphism p=new polymorphism();
		p.display(5);
		p.display();
	}
}



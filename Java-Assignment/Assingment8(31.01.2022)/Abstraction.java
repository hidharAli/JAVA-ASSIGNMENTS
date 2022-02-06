package newprogram;
abstract class Data{
	abstract void print();
}

class name1 extends Data{
	public void print(){
		System.out.println("FIRST");
	}
}

class name3 extends Data{
	public void print(){
		System.out.println("SECOND");
	}
}

class name2 extends Data{
	public void print(){
		System.out.println("THIRD");
	}
}

abstract class words {
	public static void main(String[] args) {
		name1 m=new name1();
		name3 m1=new name3();
		name2 m2=new name2();
		m.print();
		m2.print();
		m1.print();
		m.print();
		m2.print();
		m2.print();
	}
}
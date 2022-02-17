package assignment;
import java.util.ArrayList;
public class ListArray
 {
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println("List:"+a);
		Integer[] l=new Integer[a.size()];
		a.toArray(l);
		for(int i=0;i<l.length;i++){
			System.out.println("List To Array:"+l[i]);
		}
	}
}

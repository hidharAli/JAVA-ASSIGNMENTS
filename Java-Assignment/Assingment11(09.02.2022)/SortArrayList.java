package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("Descending Order in Reverse:"+a);
	}
}

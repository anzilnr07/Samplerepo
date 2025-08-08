package Foreachloop;

import java.util.ArrayList;

public class ForEachExample {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	for(int b:a) {
		System.out.println(b);
	}
	ArrayList<String>b=new ArrayList<String>();
	b.add("Red");
	b.add("Green");
	b.add("Blue");
	for(String c:b) {
	System.out.println(c);
	}
	

	}

}

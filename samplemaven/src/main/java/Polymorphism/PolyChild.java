package Polymorphism;

import Superkeyword.SuperconstructorChild;

public class PolyChild extends PolyParent{
public void display(int a,int b) {
	int c=a-b;
	System.out.println("child sum:"+c);
	super.display(30,10);
}
	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
		obj.display(40, 12);


	}

}

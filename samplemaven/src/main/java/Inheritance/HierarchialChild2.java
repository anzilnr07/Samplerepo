package Inheritance;

public class HierarchialChild2 extends HierarchialParent {
	public void show()
	{
		System.out.println("Child2 here");
	}


	public static void main(String[] args) {
		HierarchialChild2 obj=new HierarchialChild2();
		obj.show();
		obj.print();


	}

}

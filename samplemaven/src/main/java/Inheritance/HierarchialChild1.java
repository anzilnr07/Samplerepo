package Inheritance;

public class HierarchialChild1 extends  HierarchialParent {
	public void display()
	{
		System.out.println("Child1 here");
	}

	public static void main(String[] args) {
HierarchialChild1 obj=new HierarchialChild1();
obj.display();
obj.print();



	}

}

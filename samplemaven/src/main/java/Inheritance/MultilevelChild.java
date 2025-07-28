package Inheritance;

public class MultilevelChild extends MultilevelParent {
	public void display()
	{
		System.out.println("the final child");
	}

	public static void main(String[] args) {
	MultilevelChild obj =new MultilevelChild();
	obj.print();
	obj.show();
	obj.display();

	}

}

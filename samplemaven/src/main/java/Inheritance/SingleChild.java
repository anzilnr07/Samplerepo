package Inheritance;

public class SingleChild extends SingleParent {
	public void print() {
		System.out.println("to the child class");
	}

	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.display();
		obj.print();

	}

}

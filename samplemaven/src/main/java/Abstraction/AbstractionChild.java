package Abstraction;

public class AbstractionChild extends AbstractionParent {
	public void show() {
		System.out.println("bie");
	}

	public static void main(String[] args) {
	AbstractionChild obj =new AbstractionChild();//object creation
	obj.display();
	obj.print();
	obj.show();
	AbstractionParent obj1=new AbstractionChild();//reference creation (cannot call child method)
	obj1.display();
	obj1.print();
    
	}

	@Override
	public void display() {
System.out.println("Hi");
		
	}

	@Override
	public void print() {
		System.out.println("hello");
		
	}

}

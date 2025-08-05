package interfaceexample;

public class Child implements Parent1,Parent2 {
	public void print() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
Child obj=new Child();
obj.display();
obj.show();
obj.print();
	}

	@Override
	public void show() {
		System.out.println("hi");
		
	}

	@Override
	public void display() {
	System.out.println("bie");
	}

}

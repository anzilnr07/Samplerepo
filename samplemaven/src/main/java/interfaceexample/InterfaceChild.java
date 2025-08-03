package interfaceexample;

public class InterfaceChild implements InterfaceParent  {
public void show() {
	System.out.println("hello");
}
	public static void main(String[] args) {
    InterfaceChild obj=new InterfaceChild();
    obj.display();
    obj.print();
    obj.show();

	}
	@Override
	public void display() {
System.out.println("Hi");
		
	}
	@Override
	public void print() {
	System.out.println("bie");
		
	}

}

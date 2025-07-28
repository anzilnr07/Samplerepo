package Superkeyword;

public class SupervariableChild extends SupervariableParent {
	String s="Yellow";
	
	public void display() {
		System.out.println(super.s);
		System.out.println(s);
	}

	public static void main(String[] args) {
		SupervariableChild obj=new SupervariableChild();
		obj.display();

	}

}

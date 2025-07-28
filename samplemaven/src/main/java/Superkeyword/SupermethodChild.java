package Superkeyword;

public class SupermethodChild extends SupermethodParent {
	public void display2()
	{
		super.display1();
		System.out.println("child");
	
	}

	public static void main(String[] args) {
		
		SupermethodChild obj=new SupermethodChild();
		obj.display2();
	}

}

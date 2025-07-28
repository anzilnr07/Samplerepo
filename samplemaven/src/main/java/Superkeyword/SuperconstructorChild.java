package Superkeyword;

public class SuperconstructorChild extends SuperconstructorParent {
	public SuperconstructorChild() {
		super(5,6);
		System.out.println("child");
		
	}

	public static void main(String[] args) {
		SuperconstructorChild obj=new SuperconstructorChild();
		
		
	}

}

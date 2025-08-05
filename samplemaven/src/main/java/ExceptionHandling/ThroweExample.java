package ExceptionHandling;

public class ThroweExample {

	public static void main(String[] args) {
		int age=15;
		if(age>=18) {
			System.out.println("Eligible to vote");
			
		}
		else
		{
			throw new NumberFormatException("age under 18!!");
		}
	}

}

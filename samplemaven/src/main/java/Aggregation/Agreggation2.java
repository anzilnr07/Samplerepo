package Aggregation;

public class Agreggation2 {
String city,state;
Aggregation1 ref;
public Agreggation2(String city,String state,Aggregation1 ref) {
	this.city=city;
	this.state=state;
	this.ref=ref;
}
public void display() {
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
	System.out.println(city+" "+state);
}
	public static void main(String[] args) {
Aggregation1 obj2=new Aggregation1("Ramu", 23, "trivandrum");
Agreggation2 obj=new Agreggation2("Trivandrum","kerala",obj2);
obj.display();
	}

}

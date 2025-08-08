package Collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Apple");
		s.add("Grapes");
		s.add("Orange");
		Set<String>s1=new HashSet<String>();
		s1.add("Banana");
		s1.add("Watermelon");
		s.addAll(s1);
		System.out.println(s);
		s.contains("Banana");
		System.out.println(s.isEmpty());
		s.remove("Apple");
		System.out.println(s);
		System.out.println(s.contains(s1));
		s.remove(s1);
		System.out.println(s.containsAll(s1));
		s.removeAll(s1);
		System.out.println(s);
		s.clear();
	System.out.println(s);
	System.out.println(s.size());
	}

}

package question2;

import java.util.function.Predicate;

public class PReDicate {
//	predicate test the object condition and return type is boolen
//	/* it has only one abstract method */ predicate(t.test(type))
	
	public static void main(String[] args) {
		Predicate<Student> p=i->i.getMarks()>500;
		Student s=new Student(1, "ramu", 600);
	  System.out.println(p.test(s));

		
	}

}

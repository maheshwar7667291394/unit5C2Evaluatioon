package question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> student=new ArrayList<>();
		
		student.add(new Student("1", "maehsh", 600, "patna"));
		student.add(new Student("2", "ramu", 400, "banras"));
		student.add(new Student("3", "paratibha", 700, "madhubani"));
		student.add(new Student("4", "samlal", 400, "jaynagar"));
		student.add(new Student("5", "hiralal", 500, "patna"));
		
	
		
		Collection<Employee> emp=student.stream()
				                .filter(s->s.getMarks()>500)
				                .map(k->{
				                	String id=k.getRoll();
//				                	 int id=k.getRoll();
				                	 String name=k.getName();
				                	 int salary=k.getMarks()*10000;
				                	 String address=k.getAddress();
				                	
				                	 emp.add(new Employee(id, name, salary, address));
				                	 return emp;
				                	 
				                	 
				                }).collect(Collections.tolist());
	}

}

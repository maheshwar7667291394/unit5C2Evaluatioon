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
		
	
		Stream<Student> str1=student.stream();
		
		List<Employee> emp=str1.filter(f->f.getMarks()>400)
				.map(m->{
					
					Employee emp1=new Employee(m.getRoll(), m.getName(),m.getMarks()*10000, m.getAddress());
					return emp1;
				}).collect(Collectors.toList());
		for(Employee item:emp) {
			System.out.println(item);
		}
	}

}

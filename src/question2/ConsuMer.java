package question2;

import java.util.function.Consumer;

public class ConsuMer {
//	it take the input and print it and it dosent retunre any value
// onley one abstract method accept(datatype)
	
	public static void main(String[] args) {
		Consumer<Student> p=s->System.out.println(s);
		Student s=new Student(1, "ramu", 600);
		p.accept(s);
		
	}

}

package question2;

import java.util.function.Supplier;

public class SupplierS {
//	this kind function dont take any parametre as an argument but 
//	it return type T
//	it has only one abstract method p.get();
	public static void main(String[] args) {
		Supplier<Student> p=()->new Student(1, "ramu", 600);
		System.out.println(p.get());
	}

}

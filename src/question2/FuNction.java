package question2;

import java.util.function.Function;

public class FuNction {
// this type of interface convert one type of argument to another 
//	type of argumrnt
//	it has only one abstract method .apply(T,R)
	public static void main(String[] args) {
		
		Function<String, Integer> p=s->Integer.parseInt(s);
		System.out.println(p.apply("300")+400);
	}
}

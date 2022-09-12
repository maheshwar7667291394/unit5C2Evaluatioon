package question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<String> name=Arrays.asList("maehsh","rambabu","rohan","sohan","sarkar","sangakaa","raklala","pratibha","anish","ramlal");
		
		
		Collection<String> namkc=name.stream()
				.map(p->p.toUpperCase())
				.filter(k->k.length()%2==0)
				.collect(Collectors.toList());
		System.out.println(namkc);
		System.out.println();
		
		List<String> nvkc=new ArrayList<>(namkc);
		Collections.sort(nvkc,(s1,s2)->s1.compareTo(s2)>1?+1:-1);
		System.out.println(nvkc);

			
			
	}

}

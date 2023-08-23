package StreamApi;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2); 
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(5);
		Set<Integer>set=new HashSet<>();
		System.out.println(list.stream().filter(p->!set.add(p)).collect(Collectors.toList()).stream().findFirst().get());
		
		
	}
}

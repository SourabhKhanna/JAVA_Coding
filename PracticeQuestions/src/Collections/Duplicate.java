package Collections;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer>set=new HashSet<>();
		System.out.println(list.stream().filter(p->!set.add(p)).collect(Collectors.toList()).stream().findFirst().get());
		
		 
	}
}

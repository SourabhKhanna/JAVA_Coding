package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.NumberUpSupported;

public class Main {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(-20);
		list.add(40);
		list.add(30);
		list.add(10);
		list.add(22);
		list.add(28);
		

//      1	numbers starting with 1 using Stream functions
		System.out.println("Numbers starting with 1");
		list.stream().map(p->p+"").filter(p->p.startsWith("1")).forEach(System.out::println);
	
//		2  duplicate elements in a given integers list		
		Set<Integer> set=new HashSet<>();
		System.out.println("Duplicate Elements");
		list.stream().filter(p->!set.add(p)).forEach(System.out::println);
		
		
//		3   find the first element of the list		
		System.out.println("First element of the list= "+list.stream().findFirst().get());
		
		
//		4  total number of elements present in the list		
		System.out.println("Total number of elements present in the list = "+list.stream().count());
		
		
//		6  maximum value element present in list
		System.out.println("Maximum value element present in list = "+list.stream().max(Integer::compare).get());
		
		
//		7  sort all the values present in it in descending order
		System.out.println("Sortin in descending order");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);;
		
		
//		8 Average of Numbers in list		
		System.out.println("Average of numbers is = "+list.stream().mapToInt(a->a).summaryStatistics().getAverage());
		
		
//      9 pickup only numbers starts with 2
		System.out.println("Starts with 2");
		list.stream().map(p->p+"").filter(p->p.startsWith("2")||p.contains("-2")).forEach(System.out::println);
		
		
//      10  progam that accepts only two digits numbers.
		System.out.println("Two digit numbers are = ");
		list.stream().filter(p->p>9 && p<100).forEach(System.out::println);
		
		
//      11  program that will pick up those words ends 2.
		
		System.out.println("Number which ends with 2 are = ");
		list.stream().map(p->p+"").filter(p->p.endsWith("2")).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

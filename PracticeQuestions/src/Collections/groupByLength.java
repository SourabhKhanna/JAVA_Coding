package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class groupByLength {
	public static void main(String[] args) {
		 List<String> input = Arrays.asList("Himanshu", "Devraj12", "rajeesh", "pavan", "sachine");
		 System.out.println(input.stream()
         .collect(Collectors.groupingBy(String::length)));
		
	
	}

}

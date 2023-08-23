package StreamApi;

import java.util.*;
import java.util.stream.*;

class streamtoMapAccordingStringLength {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, 87, 20));
		students.add(new Student(2, 78, 21));
		students.add(new Student(3, 70, 22));
		students.add(new Student(4, 89, 23));
		String s1 = "Communication";
		String[] s2 = { "ram", "raj", "ram", "mohan", "raj" };
		System.out.println(Arrays.stream(s1.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())));
		System.out.println(
				Stream.of(s2).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())));
	}
}

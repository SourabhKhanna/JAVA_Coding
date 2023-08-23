package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseStringJava8 {
	public static void main(String[] args) {
		String str = "quick";

		// reverse a String using Java 8
		String reverseStr = Stream.of(str).map(string -> new StringBuilder(string).reverse())
				.collect(Collectors.joining());

		System.out.println(reverseStr);

	}

}

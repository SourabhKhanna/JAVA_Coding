package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertUpperCaseAndJoinComma {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Usa", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");

		System.out.println(list.stream().map(p -> p.toUpperCase()).collect(Collectors.joining(",")));
	}

}

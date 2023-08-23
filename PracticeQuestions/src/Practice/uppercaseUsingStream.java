package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uppercaseUsingStream {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(",")));

	}

}

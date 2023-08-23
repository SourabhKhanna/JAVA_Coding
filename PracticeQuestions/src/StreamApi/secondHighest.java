package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondHighest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null));

	}
}

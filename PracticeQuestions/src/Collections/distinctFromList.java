package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctFromList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 6, 7, 8, 9, 9, 10);

		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

	}

}

package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class occurenceOfEachNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3);
		System.out.println(list.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting())));

	}

}

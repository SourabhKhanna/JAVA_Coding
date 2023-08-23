package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondLargest {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 20, 3, 12);
		Optional<Integer> secondLargest = numbers.stream()
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(1) // Skip the first element
                .findFirst(); 
		System.out.println(secondLargest.get());
	}

}

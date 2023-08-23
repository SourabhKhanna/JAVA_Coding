package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class occuranceOfEachCharInString {
	public static void main(String[] args) {
		String string = "Capgemini";

		// Without Stream
		Map<Character, Integer> map = new HashMap<>();

		for (char c : string.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// With Stream

		System.out.println(string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(character -> character, Collectors.counting())));

		System.out.println(map);
	}

}

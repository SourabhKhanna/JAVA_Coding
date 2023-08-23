package Collections;

import java.util.Map;
import java.util.stream.Collectors;

public class maximumOccuringCharacter {
	public static void main(String[] args) {
		String str = "Test String";
		// Without Stream

		// With Stream
		Map<Character, Long> charCountMap = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		System.out.println(charCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getKey());
	}

}

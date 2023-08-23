package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class occurMoreThanTwice {
	public static void main(String[] args) {
		String string = "abcdaa";

		Map<Character, Integer> map = new HashMap<>();

		for (char c : string.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
	}

}

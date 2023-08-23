package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sortMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("Five", 5);
		map.put("Eight", 8);
		map.put("Seven", 7);
		map.put("Nine", 9);
		map.put("Three", 3);
		map.put("One", 1);
		map.put("Two", 2);

		List<Entry<String, Integer>> l1 = new ArrayList<>(map.entrySet());

		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(System.out::println);
		Collections.sort(l1, (o2, o1) -> o1.getKey().compareTo(o2.getKey()));

		System.out.println(map);
	}
}

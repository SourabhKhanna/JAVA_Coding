package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class descendingOrder {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(15);
		Comparator<Integer> comparator=(o1,o2)->o2.compareTo(o1);
		System.out.println(list.stream().sorted(comparator).collect(Collectors.toList()));

	}

}

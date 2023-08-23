package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class maximum {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(15);
		System.out.println(list.stream().max((o1,o2)->o1.compareTo(o2)).get());
		System.out.println(list.stream().count());
	}

}

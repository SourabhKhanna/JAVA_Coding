package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oddEven {
	public static void main(String[] args) {
		List<Object> list = Arrays.asList(1, 2, "Sourabh", 1.2,true);

		
		System.out.println(list.stream().filter(p->!(p instanceof String)).collect(Collectors.toList()));
	}

}

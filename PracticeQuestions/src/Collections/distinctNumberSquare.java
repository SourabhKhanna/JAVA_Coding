package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctNumberSquare {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(9, 10, 3, 4, 7, 3, 4);	
		System.out.println(list.stream().distinct().map(p->p*=p).collect(Collectors.toList()));
	}

}

package Collections;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class intSummaryStatistics {
	
	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//		IntSummaryStatistics intSummaryStatistics=list.stream() .mapToInt((x) -> x) .summaryStatistics();
//		System.out.println(intSummaryStatistics.getSum());
//		System.out.println(intSummaryStatistics.getMax());
		List<Integer> l1=Arrays.asList(100,2,3,4,5);
		l1.stream().findFirst().ifPresent(System.out::println);
	}

}

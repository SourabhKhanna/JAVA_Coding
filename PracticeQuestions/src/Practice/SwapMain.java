package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapMain {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	
	list.add("Red");
	list.add("Blue");
	list.add("Yellow");
	Collections.swap(list, 0, 2);	
	System.out.println(list);
	
}
}

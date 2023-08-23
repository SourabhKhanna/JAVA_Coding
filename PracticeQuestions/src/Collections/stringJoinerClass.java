package Collections;

import java.util.StringJoiner;

public class stringJoinerClass {
	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner("-","[","]");
		joiner.add("Sourabh");
		joiner.add("Khanna");
		System.out.println(joiner);
	}

}

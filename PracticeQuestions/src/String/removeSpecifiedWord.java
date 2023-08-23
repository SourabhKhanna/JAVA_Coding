package String;

import java.util.Comparator;

public class removeSpecifiedWord {
	public static void main(String[] args) {
		String string="Exercises Practice Solution";
		String word="Solution";
		string.replaceAll(word, "");
		System.out.println(string);
		
	}

}

package String;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
	public static void main(String[] args) {

		String string = "algorithm";

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (!(string.substring(i + 1, string.length()).contains("" + c))) {
				System.out.println(c);
				break;
			}

		}

	}

}

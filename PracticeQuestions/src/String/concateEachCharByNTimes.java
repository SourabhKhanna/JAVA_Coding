package String;

public class concateEachCharByNTimes {
	public static void main(String[] args) {
		String string = "Capgemini";

		String result = "";
		for (int i = 0; i < string.length(); i++) {
			result += String.valueOf(string.charAt(i)).repeat(3);

		}
		System.out.println(result);
	}

}

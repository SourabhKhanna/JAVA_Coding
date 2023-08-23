package String;

import java.util.Scanner;

class NumberGreaterThanException extends RuntimeException {

	public NumberGreaterThanException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class palindromStringCommandLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x > 10)
			throw new NumberGreaterThanException("Number graeter than 10");
		else {
			System.out.println(x);
		}

	}

}

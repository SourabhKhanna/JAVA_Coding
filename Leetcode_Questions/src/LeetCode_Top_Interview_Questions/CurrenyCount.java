package LeetCode_Top_Interview_Questions;




import java.util.Scanner;

public class CurrenyCount {
	public static int countCurrency(int amount) {
		int[] notes = new int[] { 100, 50, 10, 5, 2, 1 };
		int[] noteCounter = new int[6];
		for (int i = 0; i < 6; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
		int result = 0;
		for (int i = 0; i < 6; i++) {
			if (noteCounter[i] != 0) {
				result += noteCounter[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(countCurrency(number));
	}

}


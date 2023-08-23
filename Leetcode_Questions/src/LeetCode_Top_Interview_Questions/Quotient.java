package LeetCode_Top_Interview_Questions;





import java.util.Scanner;

public class Quotient {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int dividend=scanner.nextInt();
	int dividor=scanner.nextInt();
	try {
		System.out.println(dividend/dividor);
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
}
}

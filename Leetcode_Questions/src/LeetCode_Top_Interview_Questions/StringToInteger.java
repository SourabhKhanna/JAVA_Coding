package LeetCode_Top_Interview_Questions;

public class StringToInteger {
	static int myAtoi(String s) {
		int result=0;
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			try {
				result=new Integer(arr[i]);
			} catch (Exception e) {
				continue;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String string = "words and 987";

		System.out.println(myAtoi(string));
	}
}

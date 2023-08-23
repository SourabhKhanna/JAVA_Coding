package String;

public class reverseAllOddLength {
	public static String reverse(String str) {
		return new StringBuffer(str).reverse().toString();

	}

	public static void main(String[] args) {
		String string = "Check two consecutive identical letters in a given string";
		String arr[] = string.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				arr[i]=reverse(arr[i]);
			}
		}
		
		System.out.println(arr[5]);

	}

}

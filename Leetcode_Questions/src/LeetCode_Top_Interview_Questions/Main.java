package LeetCode_Top_Interview_Questions;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 5, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			int max = -1;
			for (int j = i + 1; j < arr.length; j++) {

				if (Math.max(max, arr[j]) > Math.max(max, arr[i])) {
					max = Math.max(max, arr[j]);
					
				}
			}
			arr[i] = max;
			System.out.println(arr[i]);

		}

		

	}
}

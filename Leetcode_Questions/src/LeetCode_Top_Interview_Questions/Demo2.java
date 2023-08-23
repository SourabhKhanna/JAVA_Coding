package LeetCode_Top_Interview_Questions;

public class Demo2 {
	static int[] nextGreatest(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int max_value = -1;

			for (int j = i + 1; j < n; j++) {
				if (Math.max(max_value, arr[j]) > Math.max(max_value, arr[i]))
					max_value = Math.max(max_value, arr[j]);
			}

			arr[i] = max_value;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 5, 1, 2 };
		int size = arr.length;
		int result[] = nextGreatest(arr, size);
		for (int i : result)
			System.out.println(i);
	}

}

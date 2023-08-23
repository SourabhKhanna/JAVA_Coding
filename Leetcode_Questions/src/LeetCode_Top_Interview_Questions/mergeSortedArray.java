package LeetCode_Top_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class mergeSortedArray {
	static void merge(int nums1[], int nums2[]) {
		List<Integer> set = new ArrayList();
		for (int i : nums1) {
			if (i != 0)
				set.add(i);
			else {
				continue;
			}
		}

		for (int j : nums2) {
			if (j != 0)
				set.add(j);
			else {
				continue;
			}
		}

		Collections.sort(set);
		nums1 = set.stream().mapToInt(Integer::intValue).toArray();
		for (int i : nums1)
			System.out.print(i + " ");

	}

	public static void main(String[] args) {
//		int nums1[] = { 1, 2, 3, 0, 0, 0 };
//		int nums2[] = { 2, 5, 6 };
//
//		merge(nums1, nums2);
		String s = "a good   example"; 
		s=s.replaceAll("\\s+"," ");
		String arr[] = s.split(" ");
		StringJoiner result = new StringJoiner(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			result.add(arr[i]);
		}

		System.out.println(result);

	}

}

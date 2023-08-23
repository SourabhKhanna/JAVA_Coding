package LeetCode_Top_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList();

		for (int i : nums1) {
			list.add(i);
		}
		for (int j : nums2) {
			list.add(j);
		}

		Collections.sort(list);

		int size = list.size();
		double res = 0;
		if (size % 2 == 0) {
			res = list.get(list.size() / 2) + list.get(list.size() / 2 - 1);
			res /= 2;

		} else {

			res = list.get(list.size() / 2);
		}

		return res;
	}

	public static void main(String[] args) {

	}
}

package LeetCode_Top_Interview_Questions;

import java.util.*;

//Given an integer array nums, return the maximum difference between two successive 
//elements in its sorted form. If the array contains less than two elements, return 0.
public class MaximumGapInArray {
	public static int maximumGap(int[] nums) {
		int result = 0;
		if (nums.length < 2)
			return 0;
		else if (nums.length == 2) {
			return Math.abs(nums[0] - nums[1]);
		} else {
			Arrays.sort(nums);
//	            {1,3,6,9}
			for (int i = 0; i < nums.length; i++) {
				try {
					if (result < Math.abs(nums[i] - nums[i + 1])) {
						result = Math.abs(nums[i] - nums[i + 1]);

					}
				} catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					break;
				}

			}
			return result;

		}
	}

	public static void main(String[] args) {

		int nums[] = { 1 };
		System.out.println(maximumGap(nums));
	}

}

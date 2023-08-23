package LeetCode_Top_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static int removeDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();

        for(int i:nums)list.add(i);     
        Set<Integer> set=new HashSet();
        return list.stream().filter(p->set.add(p)).collect(Collectors.toList()).size();
    }
	public static void main(String[] args) {
		int arr[]= new int[]{1,1,2};
		System.out.println(removeDuplicates(arr));
	}

}

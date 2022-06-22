/*
Problem Statement 
Given an array of sorted numbers, remove all duplicates from it. 
You should not use any extra space; after removing the duplicates 
in-place return the new length of the array.
Example 1:
Input: [2, 3, 3, 3, 6, 9, 9]
Output: 4
Explanation: The first four elements after removing the duplicates will be 
[2, 3, 6, 9].
Example 2:
Input: [2, 2, 2, 11]
Output: 2
Explanation: The first two elements after removing the duplicates
 will be [2, 11].
*/

import java.util.*;

public class RemoveDuplicates {
	
	public static int removeD(int[] nums) {
		int length = 0;
		int pointer1 = 0;
		int pointer2 = 1;
		int count = 0;
		
		while(count < nums.length-2) {
			if(nums[pointer1] == nums[pointer2]) {
				while(nums[pointer1] == nums[pointer2] && count < nums.length - 2) {
					pointer2++;
					count++;
				}
				length++;
				pointer1 = pointer2 - 1;
			}
			count++;
			length++;
			pointer1++;
			pointer2++;
		}
		
		return length;
	}

	public static void main(String[] args) {
		int[] nums = {2, 2, 2, 11};
		System.out.println(removeD(nums));

	}

}

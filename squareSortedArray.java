
/*
Problem Statement 
Given a sorted array, create a new array containing squares 
of all the number of the input array in the sorted order.
Example 1:
Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]
Example 2:
Input: [-3, -1, 0, 1, 2]
Output: [0 1 1 4 9]
*/

import java.util.*;

public class squareSortedArray {
	
	public static int[] square(int[] nums) {
		int[] sortedSquare = new int[nums.length];
		int right = 0;
		int left = 0;
		int count = 0;
		
		while(nums[right] < 0) {
			right++;
		}
		if(right > 0) {
			left = right - 1;
		}
		
		while(left >= 0 && right < nums.length) {
			int leftSquare = (int) Math.pow(nums[left], 2); 
			int rightSquare = (int) Math.pow(nums[right], 2);
			if(leftSquare < rightSquare) {
				sortedSquare[count] = leftSquare;
				count++;
				left--;
			}
			else {
				sortedSquare[count] = rightSquare;
				count++;
				right++;
				
			}
		}
		if(left >= 0) {
			while(left >= 0) {
				sortedSquare[count] =(int) Math.pow(nums[left], 2);
				left--;
				count++;
			}
		}
		
		if(right < nums.length) {
			while(right < nums.length ) {
				sortedSquare[count] =(int) Math.pow(nums[right], 2);
				right++;
				count++;
			}
			
		}
		
		return sortedSquare;
		
	}

	public static void main(String[] args) {
		int[] nums = {-3, -1, 0, 1, 2};
		int[] returned = square(nums);
		for(int i : returned) {
			System.out.println(i);
		}

	}

}

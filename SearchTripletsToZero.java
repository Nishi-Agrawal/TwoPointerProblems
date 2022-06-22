/*
Problem Statement 
Given an array of unsorted numbers, find all unique triplets 
in it that add up to zero.

Example 1:
Input: [-3, 0, 1, 2, -1, 1, -2]
Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
Explanation: There are four unique triplets whose sum is equal to zero.

Example 2:
Input: [-5, 2, -1, -2, 3]
Output: [[-5, 2, 3], [-2, -1, 3]]
Explanation: There are two unique triplets whose sum is equal to zero.
*/

import java.util.*;

public class SearchTripletsToZero {
	
	public static List  searchTriplets(int[] nums) {
		ArrayList<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			int left = i+1;
			int right = nums.length - 1;
			
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					ArrayList<Integer> inside = new ArrayList<>();
					inside.add(nums[i]);
					inside.add(nums[left]);
					inside.add(nums[right]);
					finalList.add(inside);
					left++;
					right--;
				}
				else if(sum < 0) {
					left++;
				}
				else {
					right--;
				}
			}
			
		}
		return finalList;
		
	}

	public static void main(String[] args) {
		int[] nums = {-5, 2, -1, -2, 3};
		List ret = searchTriplets(nums);
		System.out.println(ret);
		

	}

}

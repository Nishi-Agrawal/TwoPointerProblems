/*
Problem Challenge 1
Quadruple Sum to Target (medium) 
Given an array of unsorted numbers and a target number, find 
all unique quadruplets in it, whose sum is equal to the target number.

Example 1:
Input: [4, 1, 2, -1, 1, -3], target=1
Output: [-3, -1, 1, 4], [-3, 1, 1, 2]
Explanation: Both the quadruplets add up to the target.

Example 2:
Input: [2, 0, -1, 1, -2, 2], target=2
Output: [-2, 0, 2, 2], [-1, 0, 1, 2]
Explanation: Both the quadruplets add up to the target.
*/

import java.util.*;

public class QuadrapleSumToTarget {
	
	public static List findQuadraple(int[] nums, int target) {
		ArrayList<ArrayList<Integer>> l = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			for(int j = i + 1; j < nums.length - 2; j++) {
				int left = j+1;
				int right = nums.length - 1;
				while(left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if(sum == target) {
						ArrayList<Integer> a = new ArrayList<>();
						a.add(nums[i]);
						a.add(nums[j]);
						a.add(nums[left]);
						a.add(nums[right]);
						if(!l.contains(a)) {
							l.add(a);
						}
						
						left++;
						
					}
					else if(sum < target) {
						left++;
					}
					else {
						right--;
					}
					
				}
				
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int[] nums = {2, 0, -1, 1, -2, 2};
		System.out.println(findQuadraple(nums, 2));

	}

}

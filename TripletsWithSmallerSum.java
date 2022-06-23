import java.util.*;
/*
Problem Statement 
Given an array arr of unsorted numbers and a target sum, count 
all triplets in it such that arr[i] + arr[j] + arr[k] < target 
where i, j, and k are three different indices. Write a function 
to return the count of such triplets.

Example 1:
Input: [-1, 0, 2, 3], target=3 
Output: 2
Explanation: There are two triplets whose sum is less than the 
target: [-1, 0, 3], [-1, 0, 2]

Example 2:
Input: [-1, 4, 2, 1, 3], target=5 
Output: 4
Explanation: There are four triplets whose sum is less than the target: 
   [-1, 1, 4], [-1, 1, 3], [-1, 1, 2], [-1, 2, 3]
*/
		   
public class TripletsWithSmallerSum {
	
	public static int tripleSum(int[] nums, int target) {
		int count = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			int left = i+1;
			int right = nums.length - 1;
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum < target) {
					count += (right - left);
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] nums = {-1, 4, 2, 1, 3};
		System.out.println(tripleSum(nums, 5));

	}

}

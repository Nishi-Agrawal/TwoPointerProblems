import java.util.*;

/*

Triplet Sum Close to Target (medium)
Problem Statement 
Given an array of unsorted numbers and a target number, find 
a triplet in the array whose sum is as close to the target number 
as possible, return the sum of the triplet. 
If there are more than one such triplet, return the sum of the 
triplet with the smallest sum.

Example 1:
Input: [-2, 0, 1, 2], target=2
Output: 1
Explanation: The triplet [-2, 1, 2] has the closest sum to the target.

Example 2:
Input: [-3, -1, 1, 2], target=1
Output: 0
Explanation: The triplet [-3, 1, 2] has the closest sum to the target.

Example 3:
Input: [1, 0, 1, 1], target=100
Output: 3
Explanation: The triplet [1, 1, 1] has the closest sum to the target.

*/

public class TripleSumCloserToTarget {
	
	public static int searchTriplets(int[] nums, int target) {
		int closestSum = Integer.MAX_VALUE;
		int difference = Integer.MAX_VALUE;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				int currDifference = Math.abs(sum - target);
				if(currDifference < difference) {
					difference = currDifference;
					closestSum = sum;
					//left++;
				}
				else if(sum < target) {
					left++;
				}
				else {
					right--;
				}
				
			}
		}
		
		return closestSum;
	}

	public static void main(String[] args) {
		int[] nums = {-3, -1, 1, 2};
		System.out.println(searchTriplets(nums, 1));

	}

}

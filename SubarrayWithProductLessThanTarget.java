import java.util.*;
/*
Problem Statement 
Given an array with positive numbers and a target number, 
find all of its contiguous subarrays whose product is less than the 
target number.

Example 1:
Input: [2, 5, 3, 10], target=30 
Output: 6
Explanation: There are six contiguous subarrays whose product is less
 than the target.
 
Example 2:
Input: [8, 2, 6, 5], target=50 
Output: 7
Explanation: There are seven contiguous subarrays whose product is less 
than the target.
*/
public class SubarrayWithProductLessThanTarget {
	
	public static int subArray(int nums[], int target) {
		//ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		int count = 0;
		int windowStart = 0;
		int product = 1;
		
		for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			product *= nums[windowEnd];
			while(product >= target && windowStart < nums.length) {
				product /= nums[windowStart];
				windowStart++;
			}
			ArrayList<Integer> ar = null;
			//for printing all subarrays
//			for(int i = windowEnd; i > windowStart - 1; i--) {
//				ar = new ArrayList<>();
//				ar.add(nums[i]);
//				
//				//a.add(ar);
//			}
//			a.add(ar);
			count+=windowEnd - windowStart + 1;
			
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 5, 3, 10};
		System.out.println(subArray(nums, 30));
	}

}

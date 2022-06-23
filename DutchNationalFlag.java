/*
Problem Statement 
Given an array containing 0s, 1s and 2s, sort the array in-place. 
You should treat numbers of the array as objects, 
hence, we can’t count 0s, 1s, and 2s to recreate the array.
The flag of the Netherlands consists of three colors: red, white and blue; 
and since our input array also consists of three different numbers 
that is why it is called Dutch National Flag problem.

Example 1:
Input: [1, 0, 2, 1, 0]
Output: [0 0 1 1 2]

Example 2:
Input: [2, 2, 0, 1, 2, 0]
Output: [0 0 1 2 2 2 ]
*/
public class DutchNationalFlag {
	
	public static int[] solve(int[] nums) {
		
		int i = 0;
		int front = 0;
		int back = nums.length - 1;
		
		while(i <= back) {
			while(nums[i] != 1 && i <= back) {
				int val = nums[i];
				
				if(val == 0) {
					nums[i] = nums[front];
					nums[front] = 0;
					while(nums[front] == 0 ) {
						front++;
						i++;
					}
					
					
				}
				else if(val == 2) {
					nums[i] = nums[back];
					nums[back] = 2;
					while(nums[back] == 2) {
						back--;
					}
					
				}
				else {
					break;
				}
			}
			i++;
			
		}
		
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = {1, 0, 2, 1, 0};
		nums = solve(nums);
		for(int i : nums) {
			System.out.println(i);
		}

	}

}

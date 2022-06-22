import java.util.*;
public class PairWithTargetSum {
	
	public static int[] twoSum(int[] nums, int target) {
		/*int[] indices = new int[2];
		Arrays.sort(nums);
		int pointer1 = 0;
		int pointer2 = nums.length - 1;
		int sum = nums[pointer1] + nums[pointer2];
		while(sum != target) {
			
			if(sum < target) {
				pointer1++;
			}
			else {
				pointer2--;
			}
			sum = nums[pointer1] + nums[pointer2];
			
		}
		indices[0] = pointer1;
		indices[1] = pointer2;
		
		
		return indices;*/
		
		int[] copyArray = Arrays.copyOf(nums, nums.length);
	    Arrays.sort(copyArray);

	    int head = 0;
	    int tail = copyArray.length - 1;
	    int num1 = 0, num2 = 0;
	    while (head < tail) {
	      int sum = copyArray[head] + copyArray[tail];
	      if (sum < target) {
	        head++;
	      }
	      else if (sum > target) {
	        tail--;
	      } else {
	        num1 = copyArray[head];
	        num2 = copyArray[tail];
	        break;
	      }
	    }

	    // Create the result array with indices
	    int[] result = new int[2];
	    for (int i = 0; i < nums.length; i++) {
	      if (nums[i] == num1) result[0] = i;
	      if (nums[i] == num2) result[1] = i;
	    }
	    return result;
	}

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] r = twoSum(nums, target);
		System.out.println(r[0]);
		System.out.println(r[1]);
		

	}

}

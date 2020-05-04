package com.assigments.tasks.demo;
public class LargestSumSubArray {
			
		public static void main(String[] args) {
		
			int arr [] = {2,3,5,6,79,9,4,6,223,54,1,43};
			System.out.println(maxSubArray(arr));
			
			
		}

		
		public static int maxSubArray(int[] nums) {
		    int result = nums[0];
		    int sum = nums[0];
		 
		    for(int i=1; i<nums.length; i++){
		        sum = Math.max(nums[i], sum + nums[i]);
		        result = Math.max(result, sum);
		    }
		 
		    return result;
		} 
	


}

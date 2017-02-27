package com.leetcode.twosum;

/**
 * @author yulinfeng
 *
 * Feb 27, 2017
 */
public class TwoSum {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int[] ret = new int[2];
		ret = twoSum.twoSum(nums, 26);
		System.out.print(ret[0]+ "," + ret[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1 + i; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ret[0] = i;
					ret[1] = j;
				}
			}
		}
		
		return ret;
	}

}

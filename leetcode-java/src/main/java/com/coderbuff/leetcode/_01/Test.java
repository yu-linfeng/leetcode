package com.coderbuff.leetcode._01;

/**
 * @author okevin
 * @date 2020/1/13
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] pos = new int[2];
        pos = solution.twoSum(nums, 26);
        for (int i = 0; i < 2; i++) {
            System.out.println(pos[i]);
        }
    }
}

package com.coderbuff.leetcode._27;

/**
 * @author okevin
 * @date 2020/1/10
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        Solution solution = new Solution();
        int length = solution.removeElement(nums, 2);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}

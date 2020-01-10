package com.coderbuff.leetcode._26;

/**
 * @author yulinfeng
 * @date 2020/1/10
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        int length = solution.removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}

package com.coderbuff.leetcode._35;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author okevin
 * @date 2020/1/13
 */
public class Solution {

    /**
     * 1. 先判断字符串中是否存在target，存在则直接返回。
     * 2. 不存在再又构造一个数组。
     * 简单粗暴，不高效。效率仅超过7.58%。
     * @param nums 数组
     * @param target 目标值
     * @return 目标值所在下标
     */
    public int searchInsert(int[] nums, int target) {
        int flag = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                flag = i;
            }
        }
        if (flag != -1) {
            return flag;
        } else {
            int[] newNums = new int[nums.length + target];
            for (int i = 0; i < newNums.length; i++) {
                if (i == nums.length) {
                    newNums[i] = target;
                    return i;
                }
                if (nums[i] < target) {
                    newNums[i] = nums[i];
                } else {
                    newNums[i] = target;
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 这样能少一些空间，执行效率也能达到超过100%。
     * 但感觉还是不够优美。
     * 查找算法。
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        if (nums[0] >= target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return -1;
    }
}

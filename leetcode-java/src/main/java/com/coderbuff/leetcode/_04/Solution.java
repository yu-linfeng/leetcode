package com.coderbuff.leetcode._04;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * @author okevin
 * @date 2020/1/2
 */
public class Solution {

    /**
     * 将两个数组按大小合并后计算，但时间复杂度为O(log(m+n))
     * @param nums1 数组一
     * @param nums2 数组二
     * @return 中位数
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] sum = new int[nums1Length + nums2Length];
        int nums1Index = 0;
        int nums2Index = 0;
        int sumIndex = 0;
        double result;
        while (nums1Index < nums1Length && nums2Index < nums2Length) {
            if (nums1[nums1Index] < nums2[nums2Index]) {
                sum[sumIndex] = nums1[nums1Index];
                nums1Index++;
                sumIndex++;
            } else {
                sum[sumIndex] = nums2[nums2Index];
                nums2Index++;
                sumIndex++;
            }
        }

        while (nums1Index < nums1Length) {
            sum[sumIndex] = nums1[nums1Index];
            nums1Index++;
            sumIndex++;
        }

        while (nums2Index < nums2Length) {
            sum[sumIndex] = nums2[nums2Index];
            nums2Index++;
            sumIndex++;
        }

        if (sum.length % 2 == 0) {
            result = (sum[sum.length / 2 - 1] + sum[sum.length / 2]) * 1.0 / 2;
        } else {
            result = sum[sum.length / 2];
        }

        return result;
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        return 0.0;
    }
}

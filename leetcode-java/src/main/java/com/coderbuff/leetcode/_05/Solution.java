package com.coderbuff.leetcode._05;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author yulinfeng
 * @date 2020/1/6
 */
public class Solution {

    public String longestPalindrome(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        int length = str.length();
        int left = 0;
        int right = 0;
        boolean[][] flag = new boolean[length][length];
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                flag[i][j] = (str.charAt(i) == str.charAt(j)) && (j - i < 2 ||  flag[i + 1][j - 1]);
                if (flag[i][j] && j - i > right - left) {
                    left = i;
                    right = j;
                }
            }

        }
        return str.substring(left, right + 1);
    }
}

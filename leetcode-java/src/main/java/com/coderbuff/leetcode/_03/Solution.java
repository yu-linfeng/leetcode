package com.coderbuff.leetcode._03;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author okevin
 * @date 2019/11/18
 */
public class Solution {

    /**
     * 性能较差
     * 时间复杂度达到了O(n^2)
     * @param s 字符串
     * @return 最长子串长度
     */
    public int lengthOfLongestSubstring(String s) {
        byte[] bytes = s.getBytes();
        Set<Byte> set = new HashSet<Byte>();
        int tempMaxLength = 1;
        int maxLength = 0;
        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
            for (int j = i + 1; j < bytes.length; j++) {
                if (!set.contains(bytes[j])) {
                    set.add(bytes[j]);
                    tempMaxLength++;
                } else {
                    set.clear();
                    break;
                }
            }
            if (maxLength < tempMaxLength) {
                maxLength = tempMaxLength;
            }
            tempMaxLength = 1;
        }
        return maxLength;
    }

    /**
     * 只循环一次
     * 时间复杂度达到了O(n)
     * @param s 字符串
     * @return 最长子串长度
     */
    public int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        LinkedList<Character> queue = new LinkedList<Character>();

        for (int i = 0; i < chars.length; i++) {
            if (queue.contains(chars[i])) {
                if (queue.peekLast() == chars[i]) {
                    queue.pollLast();
                } else {
                    while (queue.peekLast() != chars[i]) {
                        queue.pollLast();
                    }
                    queue.pollLast();
                }
            }
            queue.push(chars[i]);
            if (maxLength < queue.size()) {
                maxLength = queue.size();
            }
        }

        return maxLength;
    }
}

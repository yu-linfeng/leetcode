package com.coderbuff.leetcode._14;

import sun.text.normalizer.CharacterIteratorWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author yulinfeng
 * @date 2020/1/9
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null || strs[i].length() == 0) {
                return "";
            }
            strList.add(strs[i]);
        }
        if (strList.size() == 1) {
            return strList.get(0);
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        boolean flag = true;
        while (true) {
            if (index == strList.get(0).length()) {
                break;
            }
            char temp = strList.get(0).charAt(index);
            for (int i = 0; i < strs.length; i++) {
                if (index == strList.get(i).length()) {
                    return sb.toString();
                }
                char ch = strList.get(i).charAt(index);
                if (temp == ch) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sb.append(temp);
            } else {
                break;
            }
            index++;
        }
        return sb.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

package com.coderbuff.leetcode._20;

import javax.accessibility.AccessibleHyperlink;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author okevin
 * @date 2020/1/9
 */
public class Solution {
    private Map<Character, Character> symbol = new HashMap<>();

    public Solution() {
        this.symbol.put(')', '(');
        this.symbol.put(']', '[');
        this.symbol.put('}', '{');
    }


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (symbol.containsKey(ch)) {
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (top != symbol.get(ch)) {
                        return false;
                    }
                }

            } else {
                stack.push(ch);
            }
        }

        return stack.empty();
    }
}

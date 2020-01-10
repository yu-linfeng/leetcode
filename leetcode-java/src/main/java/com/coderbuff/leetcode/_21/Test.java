package com.coderbuff.leetcode._21;

/**
 * @author okevin
 * @date 2020/1/10
 */
public class Test {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        Solution solution = new Solution();
        ListNode list = solution.mergeTwoLists(l11, l21);

    }
}

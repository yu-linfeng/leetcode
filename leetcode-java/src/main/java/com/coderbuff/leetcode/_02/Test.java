package com.coderbuff.leetcode._02;

/**
 * 9 9 9
 * 2 2
 * 1 2 0 1
 * @author yulinfeng
 * @date 2019/11/18
 */
public class Test {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(9);
        ListNode list1Node2 = new ListNode(9);
        ListNode list1Node3 = new ListNode(9);
        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;


        ListNode list2Node1 = new ListNode(2);
        ListNode list2Node2 = new ListNode(2);
        //ListNode list2Node3 = new ListNode(4);
        list2Node1.next = list2Node2;
        //list2Node2.next = list2Node3;

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(list1Node1, list2Node1);

    }
}

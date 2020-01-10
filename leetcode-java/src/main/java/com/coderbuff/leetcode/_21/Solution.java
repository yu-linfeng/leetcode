package com.coderbuff.leetcode._21;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author okevin
 * @date 2020/1/10
 */
public class Solution {

    /**
     * 合并两个有序链表
     * TODO 待解递归法
     * @param l1 链表1
     * @param l2 链表2
     * @return 合并后的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while (l1 != null) {
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }

        return head.next;
    }
}

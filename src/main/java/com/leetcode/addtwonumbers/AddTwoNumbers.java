package com.leetcode.addtwonumbers;

/**
 * 进位：有涉及到进位时，设置进位符carry，保留进位数carry /= 10;
 * 数字N中取各个位：
 * 个位：N % 10
 * 十位：(N / 10) % 10
 * 百位：(N / 100) % 10
 * ……
 * @author yulinfeng
 *
 * Feb 27, 2017
 */
public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		l11.next = l12;
		l12.next = l13;
		l13.next = null;
		
		ListNode l21 = new ListNode(0);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l21.next = null;
		
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		addTwoNumbers.addTwoNumbers(l11, l21);
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode ret = new ListNode(-1);
		ListNode tmp = ret;
		while (null != l1 || null != l2) {
		    if (null != l1) {
		        carry += l1.val;
		        l1 = l1.next;
		    }
		    if (null != l2) {
		        carry += l2.val;
		        l2 = l2.next;
		    }
			
			tmp.next = new ListNode(carry % 10);
			carry = carry / 10;
			tmp = tmp.next;
		}
		if (carry == 1) {
			tmp.next = new ListNode(1);
		}
		
		return ret.next;
	}
}

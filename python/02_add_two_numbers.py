class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        carry = 0
        ret = ListNode(-1)
        tmp = ret
        while (l1 != None or l2 != None):
            if (l1 != None):
                carry += l1.val
                l1 = l1.next
            if (l2 != None):
                carry += l2.val
                l2 = l2.next
            tmp.next = ListNode(carry % 10)
            carry = carry / 10
            tmp = tmp.next
        if (carry == 1):
            tmp.next = ListNode(1)
        return ret.next

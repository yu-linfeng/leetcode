class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    """
    合并两个有序数组
    TODO:考虑使用递归实现，效率更高
    """
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 == None:
            return l2
        if l2 == None:
            return l1
        newList = ListNode(0)
        tmp = newList
        while l1 != None and l2 != None:
            if l1.val < l2.val:
                newList.next = l1
                l1 = l1.next
            else:
                newList.next = l2
                l2 = l2.next
            newList = newList.next
        if l1 != None:
            newList.next = l1
        if l2 != None:
            newList.next = l2
        return tmp.next

if __name__ == "__main__":
    l11 = ListNode(1)
    l12 = ListNode(2)
    l13 = ListNode(4)
    l11.next = l12
    l12.next = l13

    l21 = ListNode(1)
    l22 = ListNode(3)
    l23 = ListNode(4)
    l21.next = l22
    l22.next = l23

    solution = Solution()
    print(solution.mergeTwoLists(l11, l21))
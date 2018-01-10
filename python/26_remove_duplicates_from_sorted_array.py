class Solution:
    """
    消除有序数组的多余元素，并返回数组中不重复的元素个数。
    此题对应有序链表，有序链表用指针即可指向下一个不重复的元素
    且此题要求空间复杂度为O(1)，需要有一个标志位来标示“不重复的新数组下标位置”
    """
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype:int
        """
        if not nums:
            return 0
        tail = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[tail]:
                tail += 1
                nums[tail] = nums[i]
        return tail + 1

if __name__ == "__main__":
    solution = Solution()
    nums = [1, 1, 2]
    print(solution.removeDuplicates(nums))
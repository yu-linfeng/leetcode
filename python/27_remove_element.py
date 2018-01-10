class Solution:
    """
    消除数组指定元素。
    此题思路与26_remoe_duplicates_from_sorted_array.py类似，
    同样重点在于空间复杂度为O(1)，
    需要有一个标志位记录“新数组下标位置”
    """
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        if not nums:
            return 0
        tail = -1
        for i in range(len(nums)):
            if nums[i] != val:
                tail += 1
                nums[tail] = nums[i]
        return tail + 1

if __name__ == "__main__":
    solution = Solution()
    nums = [3, 2, 2, 3]
    val = 3
    print(solution.removeElement(nums, val))
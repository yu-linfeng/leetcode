class Solution:
    """
    查找指定元素在有序数组中的下标位置并返回，不存在则返回指定元素插入数组后的下标位置
    """
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        try:
            return nums.index(target)
        except ValueError:
            index = 0
            for i, item in enumerate(nums):
                if item < target:
                    index += 1
            return index

if __name__ == "__main__":
    solution = Solution()
    nums = [1, 3, 5, 6]
    target = 4
    print(solution.searchInsert(nums, target))
class Solution:
    """
    给定一个字符列表找出最长的公共前缀。
    此处参考了leetcode中此题Discuss评论最高的解题方法，该方法的实现较为精妙，且优雅。
    使用了Python内置的zip函数，zip函数可以把列表合并，并创建一个元组对的列表；
    enumerate函数可将一个可迭代的（iterable）/可遍历的对象（如列表、字符串）组成一个索引序列，多用于for循环计数
    """
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rType: str
        """
        if not strs:
            return ""
        for i, letterGroup in enumerate(zip(*strs)):        #i表示下表，letterGroup表示当前元素
             if len(set(letterGroup)) > 1:
                return strs[0][:i]
        else:
            return min(strs)

if __name__ == "__main__":
    solution = Solution()
    strs = ["ab", "abc", "abcd"]
    print(solution.longestCommonPrefix(strs))
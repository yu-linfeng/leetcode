class Solution:
    """
    给定一个字符串haystack，查找是否包含字符串needle并返回下标，不存在返回-1。
    此题可直接使用python内置方法，haystack.find(needle)，完全符合题意。
    """
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype int
        """
        try:
            return haystack.index(needle)
        except ValueError:
            return -1
        
if __name__ == "__main__":
    solution = Solution()
    haystack = "hello"
    needle = "ll"
    print(solution.strStr(haystack, needle))
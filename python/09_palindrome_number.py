class Solution:
    """
    判断一个整数是否为回文（负数一定不是回文），重点在于掌握整数的翻转算法，此处直接利用Python自带API实现
    """
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0 or x != self.reverse(x):
            return False
        else:
            return True

    def reverse(self, x):
        return int(str(x)[::-1])

if __name__ == "__main__":
    solution = Solution()
    print(solution.isPalindrome(101))
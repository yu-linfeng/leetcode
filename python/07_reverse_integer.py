class Solution:
    def reverse(slef, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            result = -(int(str(abs(x))[::-1]))
            if (result > -2147483648):
                return result
        else:
            result = int(str(x)[::-1])
            if result < 2147483647:
                return result
        return 0

if __name__ == '__main__':
    solution = Solution()
    print(solution.reverse(-123))
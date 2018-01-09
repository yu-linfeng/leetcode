class Solution:
    """
    罗马数字转阿拉伯数字，I(1) V(5) X(10) L(50) C(100) D(500) M(1000)
    """
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum = 0
        convert = {"M" : 1000, "D" : 500, "C" : 100, "L" : 50, "X" : 10, "V" : 5, "I" : 1}
        for i in range(len(s) - 1):
            if convert[s[i]] < convert[s[i + 1]]:
                sum = sum - convert[s[i]]
            else:
                sum = sum + convert[s[i]]
        return sum + convert[s[-1]]

if __name__ == "__main__":
    solution = Solution()
    print(solution.romanToInt("CMXCIX"))
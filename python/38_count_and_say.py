class Solution:
    """
    计数。
    此题题目理解起来有点麻烦，现转述如下：
    输入1，则为“1”
    输入2，上次是“1个1”，则为“11”
    输入3，上次是“2个1”，则为“21”
    输入4，上次是“1个2，1个1”，则为“1211”
    输入5，上次是“1个1，1个2，2个1”，则为“111221”
    ……
    """
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        say = "1"
        while n > 1:
            say = self.countStr(say)
            n -= 1
        return say

    def countStr(self, strs):
        count = 0   #计数
        say = ""    #返回的字符串
        tmp = strs[0]
        for i in range(len(strs)):
            if strs[i] == tmp:
                count += 1
            else:
                say += str(count) + tmp
                tmp = strs[i]
                count = 1
        say += str(count) + tmp
        return say


if __name__ == "__main__":
    solution = Solution()
    n = 5
    print(solution.countAndSay(n))
import re
class Solution:
    """
    将字符串转换为整型，此题使用正则表达式最为简单。
    输入一个字符串：
    输入“-120aaa”，则输出“-120”
    输入“   12a2”，则输出“12”
    输入“ajff”，则输出0
    下面是简单正则表达式的学习：
    '^'：匹配字符串开头
    '$'：匹配字符串末尾
    '.'：匹配任意字符除换行符
    '[abc]'：匹配'a'或'b'或'c'
    '\d'：匹配数字，等同于[0-9]    
    '?'：非贪婪模式，匹配尽可能短的字符串
    '+'：匹配1个或多个的表达式
    """
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.strip()
        str = re.findall('^[+\\-]?\\d+', str)

        try:
            res = int(''.join(str))
            MAX = 2147483647
            MIN = -2147483648
            if res > MAX:
                return MAX
            if res < MIN: 
                return MIN
            return res
        except: 
            return 0

if __name__ == "__main__":
    solution = Solution()
    print(solution.myAtoi("-42a"))
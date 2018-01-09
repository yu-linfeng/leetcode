class Solution:
    """
    是否是合法的括号，括号成对出现
    """
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        parentheses = {'{' : '}', '[' : ']', '(' : ')'}
        stack = []
        for i, item in enumerate(s):
            if item in parentheses.keys():
                stack.append(item)
            else:
                if len(stack) == 0 or parentheses[stack.pop()] != item:
                    return False
        if len(stack) != 0:
            return False
        else:
            return True

if __name__ == "__main__":
    solution = Solution()
    s = "{{[]()}}"
    print(solution.isValid(s))
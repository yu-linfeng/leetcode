class Solution:
    """
    此题的解法参考了Discussion中的答案。
    在解题时陷入了一个“误区”，尽管有可能还是能解出来，
    要求如下：
    给定一个字符串例如“ABCDEFG”，再给定一个行数3，字符串按下列锯齿状排列：
    A   E      |  /
    B D F  ==> | / |  
    C          | 
    最后返回AEBDFC
    在一开始，根据这个锯齿状的排列，首先我想到了矩阵，也就是二维数组，
    行是确定的，但是我始终都无法找到列有多少；
    后来我一直在根据这个锯齿状的排列去需找某种规律，
    例如A所在字符串[0]位置，E在字符串[4]位置，B又在[1]位置，
    再试图根据行数3来确定某种潜在的规律，无奈又失败；
    不得已只好寻求帮助，在一个回答中找到了如下答案：
    思路是遍历给定的字符串“ABCDEF”，而不是去需要规律去字符串中取出
    """
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        step = (numRows == 1) - 1  # 0 or -1  
        rows, idx = [''] * numRows, 0
        for c in s:
            rows[idx] += c
            if idx == 0 or idx == numRows-1: 
                step = -step  #change direction  
            idx += step
        return ''.join(rows)
    
if __name__ == "__main__":
    solution = Solution()
    s = "ABCDEF"
    row = 3
    print(solution.convert(s, row))
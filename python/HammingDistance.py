#coding=utf-8
class Solution(object):
    def hammingDistance(self, x, y):
        '''
        海明距离，先做两个数字做异或运算，运算结果中1的个数即为所求的海明距离
        '''
        count = 0
        xor = x ^ y
        while xor != 0:
            if xor & 1 == 1:
                count += 1      #可简化为count += xor & 1
            xor >>= 1
        
        return count


solution = Solution()
x = 3
y = 1
print(solution.hammingDistance(x, y))
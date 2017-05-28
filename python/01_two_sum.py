# 1. Two Sum
# Given an array of integers, 
# return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, 
# and you may not use the same element twice.

class Solution:
    def twoSum(Self, nums, target):
        hash = {}
        for i in range(len(nums)):
            if target - nums[i] in hash:
                return [hash[target - nums[i]], i]
            hash[nums[i]] = i
        return [-1, -1]
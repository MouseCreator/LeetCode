from typing import List


class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        p1 = 0
        p2 = n - 1
        index = -1
        low = 0
        high = n - 1
        while p1 <= p2:
            mid = (p2 + p1) // 2
            if nums[mid] == target:
                index = mid
                low = p1
                high = p2
                break
            if nums[mid] < target:
                p1 = mid + 1
            else:
                p2 = mid - 1
        if index == -1:
            return [-1, -1]
        low_answer = index
        high_answer = index

        p1 = index
        p2 = high

        while p1 <= p2:
            mid = (p2 + p1) // 2
            if nums[mid] == target:
                high_answer = mid
                p1 = mid + 1
            else:
                p2 = mid - 1

        p1 = low
        p2 = index

        while p1 <= p2:
            mid = (p1 + p2) // 2
            if nums[mid] == target:
                low_answer = mid
                p2 = mid - 1
            else:
                p1 = mid + 1
        return [low_answer, high_answer]




arr = [5,7,7,8,8,10]
target = 8
s = Solution()
pos_res = s.searchRange(arr, target)
print(pos_res)

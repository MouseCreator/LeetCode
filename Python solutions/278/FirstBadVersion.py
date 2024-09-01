# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:
n_input = 5
bad = 4


def isBadVersion(n):
    return n >= bad


class Solution:
    def firstBadVersion(self, n: int) -> int:
        lowest = 0
        highest = n
        last_bad = -1
        while lowest <= highest:
            mid = (highest + lowest) // 2
            is_bad = isBadVersion(mid)
            if is_bad:
                highest = mid - 1
                last_bad = mid
            else:
                lowest = mid + 1

        return last_bad


s = Solution()
sol = s.firstBadVersion(n_input)
print(f"Expect: {bad}")
print(f"Actual: {sol}")

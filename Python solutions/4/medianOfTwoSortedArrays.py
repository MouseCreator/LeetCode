class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        n = len(nums1)
        m = len(nums2)
        if m < n:
            nums1, nums2 = nums2, nums1
            n, m = m, n
        is_odd_length = (n + m) % 2 == 1

        total = n + m
        half = total // 2
        m1_start = 0
        m1_end = n - 1
        while True:
            m1_med = (m1_end + m1_start) // 2
            m1_low = nums1[m1_med] if 0 <= m1_med < n else -10_000_000
            m1_high = nums1[m1_med+1] if 0 <= m1_med+1 < n else 10_000_000

            m2_med = half - m1_med - 2
            m2_low = nums2[m2_med] if 0 <= m2_med < m else -10_000_000
            m2_high = nums2[m2_med+1] if m2_med + 1 < m else 10_000_000

            if m1_low <= m2_high and m2_low <= m1_high:
                median1 = min(m1_high, m2_high)
                if is_odd_length:
                    return median1
                median2 = max(m1_low, m2_low)
                return (median1 + median2) / 2
            if m1_low <= m2_high:
                m1_start = m1_med + 1

            else:
                m1_end = m1_med - 1

def simplest_solution(nums1, nums2):
    n = len(nums1)
    m = len(nums2)
    median_index_1 = (n + m - 1) // 2
    median_index_2 = (n + m) // 2

    i = 0
    j = 0
    k = 0
    merged = [0] * (n + m)
    while i < n and j < m:
        a = nums1[i]
        b = nums2[j]
        if a < b:
            merged[k] = a
            i += 1
            k += 1
        else:
            merged[k] = b
            j += 1
            k += 1
    while i < n:
        merged[k] = nums1[i]
        i += 1
        k += 1
    while j < m:
        merged[k] = nums2[j]
        j += 1
        k += 1
    return (merged[median_index_1] + merged[median_index_2]) / 2

s = Solution()
arr1 = [2, 3, 4, 5, 6]
arr2 = [1]
simple = simplest_solution(arr1, arr2)

print(f"Simplest: {simple}")

t = s.findMedianSortedArrays(arr1, arr2)
print(t)



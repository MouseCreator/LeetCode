
class MedianFinder:
    #O(1) if arr is sorted
    #O(n) otherwise
    def find_median(self, arr_sorted):
        n = len(arr_sorted)
        if n == 0:
            return None
        if n % 2:
            return arr_sorted[n // 2]
        else:
            i1 = n // 2
            i2 = i1 - 1
            a = arr_sorted[i1]
            b = arr_sorted[i2]
            return (a + b) / 2


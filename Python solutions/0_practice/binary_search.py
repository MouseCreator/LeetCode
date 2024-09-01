import random


class BinarySearch:

    def insert_value(self, arr_sorted, new_value):

        n = len(arr_sorted)
        if n == 0:
            arr_sorted.append(new_value)
            return
        low = 0
        high = n - 1

        while True:
            if high < low:
                arr_sorted.insert(low, new_value)
                return
            mid = (low + high) // 2
            target = arr_sorted[mid]
            if new_value == target:
                arr_sorted.insert(mid, new_value)
                return
            if new_value < target:
                high = mid - 1
            else:
                low = mid + 1

def is_sorted(m_arr):
    n = len(m_arr)
    if n < 2:
        return True
    prev = m_arr[0]
    for t in range(1, n-1):
        s = m_arr[t]
        if s < t:
            return False
        prev = s
    return True


from_v = 1
to_v = 17
shuffled = list(range(from_v, to_v))
random.shuffle(shuffled)
dynamic = []
bs = BinarySearch()

count = 0
for i in shuffled:
    count += 1
    bs.insert_value(dynamic, i)

    if not is_sorted(dynamic):
        print(f"ERROR inserting {i}!")
        break

print(f"Result: {dynamic}")


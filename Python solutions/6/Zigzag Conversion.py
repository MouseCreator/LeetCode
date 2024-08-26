class Solution(object):
    def convert(self, s, numRows):
        lens = len(s)
        if numRows == 1 or lens <= numRows:
            return s
        symbolsZigZaging = numRows - 2

        positions = []
        step = numRows + symbolsZigZaging
        after_step = 0
        for i in range(numRows):
            j = i
            positions.append(j)
            modified = True
            while modified:
                j = j + step
                modified = False
                if j < lens and step > 0:
                    positions.append(j)
                    modified = True
                j = j + after_step
                if j < lens and after_step > 0:
                    positions.append(j)
                    modified = True
            step = step - 2
            after_step = after_step + 2
        res_str = ""
        for p in positions:
            res_str = res_str + s[p]
        return res_str







st = Solution()
print(st.convert("ABCDEFGHIJKLMNOPQRS", 6))
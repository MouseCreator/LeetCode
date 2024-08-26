class Solution(object):
    def convert(self, s, numRows):
        symbolsZigZaging = numRows - 2
        lens = len(s)
        expected_columns = (lens - numRows) // (numRows + symbolsZigZaging) + 1
        print(expected_columns)




st = Solution()
print(st.convert("PAYPALISHIRING", 4))
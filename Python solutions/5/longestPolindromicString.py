class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        length_long = len(s)

        if length_long == 0:
            return s
        first = s[0]
        longest = first
        for i in range(1, length_long):
            if s[i] == first:
                longest = longest + first
            else:
                break
        longest_len = len(longest)
        for i in range(1, length_long-1):
            current_poly2 = ""
            if s[i+1] == s[i]:
                current_poly2 = s[i] + s[i+1]
                th = min(i + 1, length_long - i - 1)
                for j in range(1, th):
                    t1 = s[i - j]
                    t2 = s[i + j + 1]
                    if t1 == t2:
                        current_poly2 = t1 + current_poly2 + t2
                    else:
                        break
            current_poly1 = s[i]
            th = min(i + 1, length_long - i)
            for j in range(1, th):
                t1 = s[i-j]
                t2 = s[i+j]
                if t1 == t2:
                    current_poly1 = t1 + current_poly1 + t2
                else:
                    break
            cp_len1 = len(current_poly1)
            cp_len2 = len(current_poly2)
            if cp_len1 > cp_len2:
                current_poly = current_poly1
                cp_len = cp_len1
            else:
                current_poly = current_poly2
                cp_len = cp_len2
            if cp_len > longest_len:
                longest_len = cp_len
                longest = current_poly
        return longest


s = Solution()
t = s.longestPalindrome("yzzzzzzzzzzy")
print(t)

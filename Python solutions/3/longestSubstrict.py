class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        chars = list(s)
        used_chars = {}
        i = 0
        if not s:
            return 0
        longest = 1
        last_unsafe = 0
        for c in chars:
            i = i + 1
            t = used_chars.get(c)
            if t is not None:
                last_unsafe = max(last_unsafe, t)
            distance_between_chars = i - last_unsafe
            longest = max(longest, distance_between_chars)
            used_chars[c] = i
        return longest

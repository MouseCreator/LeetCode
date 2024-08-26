class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix = ""
        if not strs:
            return prefix
        min_length = 250
        for st in strs:
            min_length = min(min_length, len(st))
        should_break = False
        for i in range(min_length):
            target = strs[0][i]
            for st in strs:
                if st[i] != target:
                    should_break = True
                    break
            if should_break:
                break
            else:
                prefix = prefix + target
        return prefix



s = Solution()
p = s.longestCommonPrefix(["flower","flow","flight"])
print(p)
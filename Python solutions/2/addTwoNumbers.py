from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    def __str__(self):
        app = ""
        if self.next:
            app = str(self.next)
        return f"{self.val}{app}"

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        memory = False
        node1 = l1
        node2 = l2
        prev = None
        root = ListNode()
        while node1 and node2:
            current = ListNode()
            if prev:
                prev.next = current
            else:
                root = current
            temp = node1.val + node2.val
            if memory:
                memory = False
                temp += 1
            if temp > 9:
                memory = True
                temp -= 10
            prev = current
            node1 = node1.next
            node2 = node2.next
            current.val = temp
        while node1:
            current = ListNode()
            prev.next = current
            temp = node1.val
            if memory:
                memory = False
                temp += 1
            if temp > 9:
                memory = True
                temp -= 10
            prev = current
            current.val = temp
            node1 = node1.next
        while node2:
            current = ListNode()
            prev.next = current
            temp = node2.val
            if memory:
                memory = False
                temp += 1
            if temp > 9:
                memory = True
                temp -= 10
            prev = current
            current.val = temp
            node2 = node2.next
        if memory:
            prev.next = ListNode(1)
        return root

s = Solution()
def init_with_str(s):
    root = None
    prev = None
    for ch in s:
        current = ListNode(int(ch))
        if prev:
            prev.next = current
        else:
            root = current
        prev = current
    return root

first = init_with_str("249")
second = init_with_str("5649")
m = s.addTwoNumbers(first, second)
st = ""
while m:
    st = st + f"{m.val}"
    m = m.next
print(st)
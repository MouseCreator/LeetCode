# Definition for singly-linked list.
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        root = None
        active1 = list1
        active2 = list2
        prev = None
        while active1 and active2:
            current = ListNode()
            if prev:
                prev.next = current
            else:
                root = current
            val1 = active1.val
            val2 = active2.val

            if val1 < val2:
                current.val = val1
                active1 = active1.next
            else:
                current.val = val2
                active2 = active2.next
            prev = current
        while active1:
            current = ListNode(active1.val)
            if prev:
                prev.next = current
            else:
                root = current
            prev = current
            active1 = active1.next
        while active2:
            current = ListNode(active2.val)
            if prev:
                prev.next = current
            else:
                root = current
            prev = current
            active2 = active2.next
        return root

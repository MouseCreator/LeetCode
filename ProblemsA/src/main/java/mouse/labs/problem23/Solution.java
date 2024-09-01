package mouse.labs.problem23;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(c -> c.val));
        for (ListNode listNode : lists) {
            if (listNode != null) {
                priorityQueue.add(listNode);
            }
        }
        ListNode extra = new ListNode();
        ListNode prev = extra;
        while (!priorityQueue.isEmpty()) {
            ListNode current = priorityQueue.poll();
            ListNode currentNode = new ListNode();
            prev.next = current;
            currentNode.val = current.val;
            ListNode active = current.next;
            if (active != null) {
                priorityQueue.add(active);
            }
            prev = currentNode;
        }
        return extra.next;
    }
}

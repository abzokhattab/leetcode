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
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        boolean f = false;
        while (fast != null && fast.next != null) {
            f = true;
            slow = slow.next;
            fast = fast.next;
        }
     //   slow.next = slow.next.next;
        if (slow == head && fast == null) head = head.next; else slow.next = slow.next.next;
        //  else if ()
        //else if (slow == null || slow.next == null) return null; else slow.next = slow.next.next;

        return head;
    }
}

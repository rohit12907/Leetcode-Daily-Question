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

        ListNode s = head;
        ListNode f = head;

        // move fast n steps
        for(int i = 1; i <= n; i++) {
            f = f.next;
        }

        // remove head
        if(f == null) {
            return head.next;
        }

        // move both
        while(f.next != null) {
            s = s.next;
            f = f.next;
        }

        // delete node
        s.next = s.next.next;

        return head;
    }
}
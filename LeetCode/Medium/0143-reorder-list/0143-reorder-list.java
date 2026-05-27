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

    // Reverse Linked List
    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Find Middle Node
    public ListNode middle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Left middle for even length
        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {

        // Edge cases
        if(head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle
        ListNode mid = middle(head);

        // Step 2: Split list
        ListNode secondHead = mid.next;
        mid.next = null;

        // Step 3: Reverse second half
        secondHead = reverse(secondHead);

        // Step 4: Merge both halves
        ListNode t1 = head;
        ListNode t2 = secondHead;

        while(t1 != null && t2 != null) {

            ListNode next1 = t1.next;
            ListNode next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
    }
}
class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0)
            return head;

        ListNode temp1 = head;

        int size = 0;

        // Find size
        while(temp1 != null){

            size++;

            temp1 = temp1.next;
        }

        // Reduce k
        k = k % size;

        if(k == 0)
            return head;

        // Find new tail
        ListNode temp2 = head;

        for(int i = 0; i < size - k - 1; i++){
            temp2 = temp2.next;
        }

        // New head
        ListNode newhead = temp2.next;

        // Break link
        temp2.next = null;

        // Reach last node
        ListNode temp4 = newhead;

        while(temp4.next != null){
            temp4 = temp4.next;
        }

        // Connect
        temp4.next = head;

        return newhead;
    }
}
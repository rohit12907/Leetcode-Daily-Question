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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode s = head ;
         ListNode f = head ;
     ListNode temp = head; ;
        for(int i =1 ; k>i;i++){
            f = f.next ;
        }
      ListNode beg = f ;
        while(f.next != null){
           s = s.next ;
           f = f.next;
        }
     ListNode end = s ;
        int t = beg.val;
        beg.val = end.val;
        end.val = t ;

        return head ;
        


        
    }
}
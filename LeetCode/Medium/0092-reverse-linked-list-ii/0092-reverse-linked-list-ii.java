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

    static ListNode reverse(ListNode head) {
    if(head==null || head.next == null) return head ;
    ListNode a = head.next ;
    head.next = null ; 
     ListNode b = reverse(a);
     a.next = head ; 
     return b ; 
 
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode d = new   ListNode(-1);
        d.next = head ;
        ListNode t = d ;
        ListNode h2;
        ListNode h3 ; 

        ListNode t1 ; 
        ListNode t2; 
        //   ListNode tail2;
        for(int i = 1 ; i<left; i++){
            t = t.next ; 
        }
             t1 = t ; 
             h2 = t.next ;

             t = d ; 
            for(int i = 1 ; right >=i ; i++){
            t= t.next ; 
        }
        t2 = t ; 
        h3 = t.next ;
t1.next = null ;
t2.next = null ;
    

   
      ListNode rev = reverse(h2);


        // Connexction 
        t1.next = t2 ; 
        h2.next = h3 ;

return d.next ;

    }
}
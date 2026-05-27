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
 import java.util.*;
class Solution {

        static ListNode  reversell(ListNode head){
           ListNode  c = head;
            ListNode  p = null ; 
           ListNode  f = null ;
            while(c != null){
                f = c.next ; 
                c.next = p ; 
                p = c; 
                c = f ;
            }
            return p ;
        }
        static ListNode findmiddle(ListNode head){
            ListNode  s = head ; 
            ListNode  f = head ; 
            while(f.next.next != null){
                f =f.next.next;
                s= s.next;
            }
            return s ;
        }
        
    public int pairSum(ListNode head) {
        int sum = 0 ;
     ListNode mid = findmiddle(head);
       ListNode sechead = mid.next; 
        mid.next = null ;
        ListNode newll = reversell(sechead);
        ListNode t1 = head ; 
       ListNode t2 = newll;
        while(t1!=null && t2!=null){
            int minsum ;
            minsum = t1.val + t2.val;
            sum = Math.max(minsum,sum);
          
            t1 = t1.next ; 
            t2 = t2.next ;
        }
        return sum ;
}

}
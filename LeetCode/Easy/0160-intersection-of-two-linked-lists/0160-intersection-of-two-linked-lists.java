/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        
     ListNode   tempa = headA;
      ListNode  tempb = headB ;
    //        ListNode   s= headA;
    //   ListNode  f = headB ;
      int sA = 0 ;
      int sB = 0 ;

      while(tempa != null){
        sA++;
        tempa = tempa.next ;

      }

        while(tempb != null){
        sB++;
        tempb = tempb.next ;

      }

       tempa = headA;
      tempb = headB ;
    //   int sd = Math.abs(sA- sB);
    if(sA>sB){
        for(int i = 1 ; i <= sA - sB ; i++){
            tempa = tempa.next;
        }

    }
    else{
        for(int i = 1 ; i <= sB - sA ; i++){
            tempb = tempb.next;
        }

    }
    while(tempa != tempb){
        tempa= tempa.next ;
        tempb = tempb.next ;
    }
 return tempa;
    }
}
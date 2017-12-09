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
        ListNode ha = headA,hb = headB;
        int a=0,b=0;
        if(ha==null||hb==null){
            return null;
        }
        if(ha==hb){
            return ha;
        }
        while(ha!=null){
            ha = ha.next;
            a++;
        }
        while(hb!=null){
            hb = hb.next;
            b++;
        }
        ha = headA;
        hb=headB;
        if(a>b){
            int c = a-b;
            while(c>0){
                ha = ha.next;
                --c;
            }
        }else{
            int c = b-a;
            while(c>0){
                hb = hb.next;
                --c;
            }
        }
        
        while(ha!=hb){
            ha = ha.next;
            hb = hb.next;
        }
        return ha;
    }
}
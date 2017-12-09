/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow = head,fast = head;
        boolean b = false;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                b = true;
                break;
            }
        }
        if(b==false) return null;
        else{
            slow = head;
            while(fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next = null;
        return slow;
    }
}
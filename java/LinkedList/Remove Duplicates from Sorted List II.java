/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // if(head==null){
        //     return head;
        // }
        // ListNode cur = new ListNode(0);
        // cur.next = head;
        // ListNode pre = cur,node = head;
        // while(node!=null){
        //     boolean b = true;
        //     while(node.next!=null&&node.next.val == node.val){
        //         node = node.next;
        //         b=false;
        //     }
        //     pre.next = (b==true)?node:node.next;
        //     pre = (b==true)?pre.next:pre;
        //     node = node.next;
        // }
        // return cur.next;
        if(head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while (head.next != null && head.next.next != null) {
            if (head.next.val == head.next.next.val) {
                int val = head.next.val;
                while (head.next != null && head.next.val == val) {
                    head.next = head.next.next;
                }            
            } else {
                head = head.next;
            }
        }
        
        return dummy.next;
    }
}
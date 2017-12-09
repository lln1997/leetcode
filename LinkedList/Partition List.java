/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode cur = new ListNode(0),pre = cur;
        ListNode n = new ListNode(0),nn=n;
        cur.next = head;
        while(pre.next!=null){
            if(pre.next.val<x){
                pre = pre.next;
            }else{
                nn.next = pre.next;
                pre.next = pre.next.next;
                nn = nn.next;
                nn.next = null;
            }
        }
        pre.next = n.next;
        return cur.next;
    }
}
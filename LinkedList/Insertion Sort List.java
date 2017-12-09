/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur = new ListNode(0),pre = cur;
        ListNode node = head,node1 = head.next;
        node.next = null;
        cur.next = node;
        while(node1!=null){
            ListNode n = node1.next;
            node1.next = null;
            while(pre.next!=null){
                if(pre.next.val>=node1.val) break;
                else pre = pre.next;
            }
            node1.next = pre.next;
            pre.next = node1;
            pre = cur;
            node1 = n;
        }
        return cur.next;
    }
}
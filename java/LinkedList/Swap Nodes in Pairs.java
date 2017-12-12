/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        // ListNode node = head;
        // int a=0;
        // while(node!=null){
        //     node = node.next;
        //     a++;
        // }
        // node = head;
        // ListNode l = new ListNode(-1),pre = l;
        // int b = (a%2==0)?a/2:a/2+1;
        // while(b>0){
        //     if(node.next==null){
        //         pre.next = node;
        //         return l.next;
        //     }
        //     pre.next = node.next;
        //     pre = pre.next;
        //     pre.next = node;
        //     pre = pre.next;
        //     node = node.next.next;
        //     b--;
        // }
        // return l.next;
        //³¬Ê±
        ListNode cur = new ListNode(-1);
        cur.next = head;
        ListNode pre = cur;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode first = pre.next;
            ListNode second = pre.next.next;
            first.next = second.next;
            second.next = first;
            pre.next = second;
            pre = pre.next.next;
        }
        return cur.next;
    }
}
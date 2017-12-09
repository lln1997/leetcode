/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = new ListNode(0),pre = cur,node = head;
        cur.next = head;

        while(node!=null){
            if(node.val == val){
                pre.next = node.next;
            }else{
                pre = pre.next;
            }
            node = node.next;
        }
        return cur.next;
    }
}
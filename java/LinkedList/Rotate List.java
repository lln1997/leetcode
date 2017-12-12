/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode node = head;
        ListNode cur = new ListNode(0),pre = cur;
        int a = 0;
        while(node!=null){
            node = node.next;
            a++;
        }
        k = (a<=k)?k%a:k;
        if(k==0){
            return head;
        }
        int b = (a-k)-1;
        node = head;
        while(b>0){
            node = node.next;
            b--;
        }
        cur.next = node.next;
        node.next = null;
        while(pre.next!=null){
            pre = pre.next;
        }
        pre.next = head;
        return cur.next;
    }
}
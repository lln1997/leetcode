/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1 = new ListNode(-1);
        ListNode node = head,pre = l1;
        int a=0,b;
        while(node!=null){
            node = node.next;
            a++;
        }
        b = a-n;
        if(b==0){
            return head.next;
        }else{
            ListNode k = null;
            while(b>0){
                k = head.next;
                head.next = null;
                pre.next = head;
                pre = pre.next;
                head = k;
                b--;
            }
            if(k.next!=null){
                pre.next = k.next;
            }
        }
        return l1.next;
    }
}
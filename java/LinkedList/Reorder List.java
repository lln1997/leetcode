/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head,fast = head;
        while(fast.next!=null){
            fast = fast.next;
            if(fast.next!=null) fast = fast.next;
            else break;
            slow = slow.next;
        }
        ListNode end = slow.next;//后半部分
        end = reverse(end);//翻转
        slow.next = null;
        ListNode begin = head;//前半部分
        ListNode p1 = begin,p2 = end;
        while(p2!=null){
            ListNode n = p2.next;
            p2.next = null;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p1.next.next;
            p2 = n;
        }
    }
    
    public ListNode reverse(ListNode h){
        ListNode pre = null;
        while(h!=null){
            ListNode node = h.next;
            h.next = pre;
            pre = h;
            h = node;
        }
        return pre;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = new ListNode(0);
        ListNode head = n1;
        int c = 0;
        while(l1!=null||l2!=null||c!=0){
            ListNode cur = new ListNode(0);
            int sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+c;
            cur.val = sum%10;
            c = sum/10;
            head.next = cur;
            head = cur;

            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return n1.next;
    }
}

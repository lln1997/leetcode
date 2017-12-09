/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m>=n||head==null){
            return head;
        }
        ListNode cur = new ListNode(0),star = cur;
        cur.next = head;
        ListNode n1 = null,n2 = null;
        int i;
        for(i = 1;i<=n;i++){
            if(i<m){
                star = star.next;
            }else if(i == m){
                n1 = star.next;
                n2 = n1.next;
            }else{
                n1.next = n2.next;
                n2.next = star.next;
                star.next = n2;
                n2 = n1.next;
            }
        }
        return cur.next;
    }
}
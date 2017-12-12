/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // if(head==null||head.next==null) return head;
        // ListNode odd = new ListNode(0);//ÆæÊý
        // ListNode even = new ListNode(0);//Å¼Êý
        // ListNode node = head,o = odd,e = even;
        // int a = 1;
        // while(head!=null){
        //     ListNode n = head.next;
        //     head.next = null;
        //     if(a%2==0){
        //         e.next = head;
        //         e = e.next;
        //     }
        //     else{
        //         o.next = head;
        //         o = o.next;
        //     }
        //     head = n;
        //     a++;
        // }
        // o.next = even.next;
        // return odd.next;
        if (head != null) {
    
            ListNode odd = head, even = head.next, evenHead = even; 
    
            while (even != null && even.next != null) {
                odd.next = odd.next.next; 
                even.next = even.next.next; 
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead; 
        }
        return head;
    }
}
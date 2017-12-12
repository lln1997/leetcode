/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return toBST(head,null);
    }
    
    public TreeNode toBST(ListNode head,ListNode tail){
        ListNode slow = head,fast = head;
        if(head==tail){
            return null;
        }
        while(fast!=tail&&fast.next!=tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode f = new TreeNode(slow.val);
        f.left = toBST(head,slow);
        f.right = toBST(slow.next,tail);
        return f;
    }
}

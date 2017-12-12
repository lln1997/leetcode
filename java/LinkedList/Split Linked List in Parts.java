/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] nn = new ListNode[k];

        if(root==null){
            return nn;
        }
        int n = 0,c,ys,i;
        ListNode node = root;
    
        while(node!=null){
            node = node.next;
            n++;
        }
        
        ys = n%k;
        
        if(k>n){
            for(i=0;i<ys;i++){
                ListNode l = root.next;
                root.next = null;
                nn[i] = root;
                root = l;
            }
        }else{
            for(i=0;i<k;i++){
                ListNode l = new ListNode(-1),r = l;

                if(i<ys) c = n/k+1;
                else c = n/k;
            
                while(c>0&&root!=null){
                    ListNode ll = root.next;
                    root.next = null;
                    r.next = root;
                    r = r.next;
                    root = ll;
                    --c;
                }
                nn[i] = l.next;
            }
        }
 
        return nn;
    }
}
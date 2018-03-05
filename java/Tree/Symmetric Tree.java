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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return lala(root.left,root.right);
    }
    
    public boolean lala(TreeNode l,TreeNode r){
        if(l==null||r==null) return l==r;
        if(l.val!=r.val) return false;
        
        return lala(l.left,r.right)&&lala(l.right,r.left);
    }
}
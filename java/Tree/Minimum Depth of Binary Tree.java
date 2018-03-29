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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left  = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.right==null&&root.left!=null) return left+1;
        if(root.right!=null&&root.left==null) return right+1;
        return 1+Math.min(left,right);
    }
}
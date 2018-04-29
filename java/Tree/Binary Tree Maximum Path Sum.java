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
    private int maxSum=0;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0,helper(root.left));//如果是负数则取0
        int right = Math.max(0,helper(root.right));
        maxSum = Math.max(maxSum,left+right+root.val);
        return Math.max(left,right)+root.val;//返回值为父节点的left,right值（left,right是保存左右子树最大值的变量）
    }
}
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> s = new Stack();
        
        TreeNode cur = root;
        while(cur!=null||!s.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            cur = cur.right;
        }
        return list;
    }
}
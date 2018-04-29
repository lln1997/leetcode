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
    // private List<Integer> list = new ArrayList<Integer>();
    //ตÝน้
//     public List<Integer> postorderTraversal(TreeNode root) {
//         helper(root);
//         return list;
//     }
    
//     public void helper(TreeNode root){
//         if(root==null) return;
        
//         helper(root.left);
//         helper(root.right);
//         list.add(root.val);
//     }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode t = root;
        
        while(!s.isEmpty()||t!=null){
            if(t!=null){
                s.push(t);
                list.addFirst(t.val);
                t=t.right;
            }else{
                TreeNode n = s.pop();
                t = n.left;
            }
        }
        return list;
    }
}
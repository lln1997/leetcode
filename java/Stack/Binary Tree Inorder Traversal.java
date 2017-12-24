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
    // public List<Integer> list = new ArrayList<Integer>();
    // public Stack<Integer> stack = new Stack<Integer>();
	
// 	public List<Integer> inorderTraversal(TreeNode root) {
//         if(root==null) return list;
//         return la(root);
//     }
    
//     public List<Integer> la(TreeNode root){
//     	if(root!=null){
//     		la(root.left);
//     		list.add(root.val);
//         	la(root.right);
//     	}
//     	return list;
//     }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode c = root;
        
        while(c!=null||!stack.isEmpty()){
            while(c!=null){
                stack.push(c);
                c = c.left;
            }
            c = stack.pop();
            list.add(c.val);
            c = c.right;
            
        }
        return list;
    }
}
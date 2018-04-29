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
    private List<List<Integer>> list = new ArrayList<List<Integer>>();
    int level = 0;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root,level);
        return list;
    }
    
    public void levelOrder(TreeNode root,int level){
        if(root==null) return;
        //×¢ÒâÌõ¼þ
        if(level>=list.size())
            list.add(new ArrayList<Integer>()); 
        
        list.get(level).add(root.val);
        
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
        
    }
}
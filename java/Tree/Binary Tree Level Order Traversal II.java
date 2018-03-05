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
    //深度优先

//     public List<List<Integer>> levelOrderBottom(TreeNode root) {
//         List<List<Integer>> list = new ArrayList();
//         if(root==null) return list;
//         add(root,list,0);
//         Collections.reverse(list);
//         return list;
//     }

//     public void add(TreeNode root,List l,int level){
//         if(root==null) return;
//         if(list.size() < level+1){
//             List<Integer> ll = new ArrayList<Integer>();
//             list.add(ll);
//         }
//         list.get(level).add(root.val);
//         add(root.left,list,level+1);
//         add(root.right,list,level+1);
//     }

    //广度优先
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root==null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> l = new ArrayList<Integer>();
            for(int i = 0;i<level;i++){
                TreeNode t = q.poll();
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
                l.add(t.val);
            }
            list.add(0,l);
        }
        return list;
    }
}

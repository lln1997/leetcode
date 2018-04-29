/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    public Stack<TreeNode> s;
    
    public BSTIterator(TreeNode root) {
        s = new Stack();
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode t = s.pop();
        pushAll(t.right);
        return t.val;
    }
    
    public void pushAll(TreeNode node){
        for(;node!=null;node=node.left) s.push(node);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
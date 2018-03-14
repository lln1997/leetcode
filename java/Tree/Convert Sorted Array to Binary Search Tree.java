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
    public TreeNode sortedArrayToBST(int[] nums) {
        int high = nums.length-1,low=0;
        TreeNode node = binarySearch(nums,low,high);
        return node;
    }
    
    public TreeNode binarySearch(int[] a,int low,int high){
        if(low>high) return null;
        int mid = low+(high-low)/2;
        TreeNode node = new TreeNode(a[mid]);
        node.left = binarySearch(a,low,mid-1);
        node.right = binarySearch(a,mid+1,high);
        return node;
    }
}
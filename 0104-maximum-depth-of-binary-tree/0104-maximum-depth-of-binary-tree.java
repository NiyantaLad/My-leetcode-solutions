/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public int maxDepth(TreeNode root) {
    //     Bottom up-approach (post-order traversal)
    //     if (root == null) {
    //     return 0;
    //     }
    //     int left= maxDepth(root.left);
    //     int right= maxDepth(root.right);
    //     return (Math.max(left,right)+1);
    // }
    private int answer;
    public void maxDepth(TreeNode root,int depth){
        //top-down approach (pre-order traversal)
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            answer= Math.max(answer,depth);
        maxDepth(root.left,depth+1);
        maxDepth(root.right,depth+1);
    }
    
    public int maxDepth(TreeNode root){
        maxDepth(root,1);
        return answer;
    }
}
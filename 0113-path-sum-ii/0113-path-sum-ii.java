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
    private List<List<Integer>> totalPaths = new ArrayList<>();
    Stack<Integer> path = new Stack<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return totalPaths;
        path.push(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0){
            
            totalPaths.add(new ArrayList<Integer>(path));
        }
        
        totalPaths= pathSum(root.left,targetSum-root.val);
        totalPaths= pathSum(root.right,targetSum-root.val);
        path.pop();
        return totalPaths;
    }
}
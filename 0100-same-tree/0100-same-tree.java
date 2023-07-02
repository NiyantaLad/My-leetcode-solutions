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
    
    
    
    public List<Integer> dfs(TreeNode node, List<Integer> list){
        if(node==null){
            
            list.add(null);
            return list;
        }
        list.add(node.val);
        dfs(node.left,list);
        dfs(node.right,list);
        return list;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> plist = new ArrayList<>();
        List<Integer> qlist = new ArrayList<>();
        plist=dfs(p,plist);
        qlist=dfs(q,qlist);
        return (plist.equals(qlist));
    }
}
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
    
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//     // base case
//     if(p==null || q==null) return p==null && q==null;
//     // recursion
//     return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
// } 
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
    // p and q are both null
    if (p == null && q == null) return true;
    // one of p and q is null
    if (q == null || p == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
  }
    
//     public List<Integer> dfs(TreeNode node, List<Integer> list){
//         if(node==null){
            
//             list.add(null);
//             return list;
//         }
//         list.add(node.val);
//         dfs(node.left,list);
//         dfs(node.right,list);
//         return list;
//     }
    
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         List<Integer> plist = new ArrayList<>();
//         List<Integer> qlist = new ArrayList<>();
//         plist=dfs(p,plist);
//         qlist=dfs(q,qlist);
//         return (plist.equals(qlist));
//     }
}
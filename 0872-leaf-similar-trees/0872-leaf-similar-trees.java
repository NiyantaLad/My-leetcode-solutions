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

    public List<Integer> dfs(TreeNode node,List<Integer> list){
        if(node==null){
            return list;
        }
        if(node.left==null && node.right==null){
            list.add(node.val);
        }
        
        dfs(node.left,list);
        dfs(node.right,list);
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        list1=dfs(root1,list1);
        list2=dfs(root2,list2);   
        return(list1.equals(list2));
    }
    
     
}
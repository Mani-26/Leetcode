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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> li1=new ArrayList<>();
        List<Integer> li2=new ArrayList<>();
        helper(root1,li1);
        helper(root2,li2);
        return li1.equals(li2);
    }
    public void helper(TreeNode root, List<Integer> li){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            li.add(root.val);
            // return;
        }
        helper(root.left,li);
        helper(root.right,li);
    }
}
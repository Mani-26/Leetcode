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
    int count=0;
    int dfs(TreeNode root, int max){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        if(root.left==null && root.right==null){
            count++;
            return root.val;
        }
        max=Math.max(max, dfs(root.left,Integer.MIN_VALUE));
        max=Math.max(max, dfs(root.right,Integer.MIN_VALUE));
        if(root.val>=max){
            count++;
            return root.val;
        }
        return max;
    }
    public int countDominantNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return 1;
        }
        dfs(root, Integer.MIN_VALUE);
        return count;
    }
}